package com.xiaoxz.bio;

public class FutureData implements Data{

    private RealData realData;
    private boolean isReady = false;

    public  synchronized  void setRealData(RealData data) {
        if(isReady) {
            return;
        }
        this.realData = data;
        this.isReady = true;
        notifyAll();
    }



    @Override
    public synchronized String getResult() {
        if(!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.getResult();
    }
}
