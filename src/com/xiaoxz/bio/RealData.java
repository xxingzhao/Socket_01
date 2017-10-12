package com.xiaoxz.bio;

public class RealData implements Data {
    private String result;

    public RealData(String result) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<10; i++) {
            sb.append(result);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.result = sb.toString();
    }

    @Override
    public String getResult() {
        return this.result;
    }
}
