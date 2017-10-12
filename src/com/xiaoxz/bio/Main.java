package com.xiaoxz.bio;

public class Main {

    public static void main(String[] args){
        RealData realData = new RealData("data");

        FutureData futureData = new FutureData();
        futureData.setRealData(realData);

        System.out.println("获取数据前..........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据：" +futureData.getResult());

    }


}
