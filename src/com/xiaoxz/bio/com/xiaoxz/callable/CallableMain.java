package com.xiaoxz.bio.com.xiaoxz.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableMain {

    public static void main(String[] args){
        FutureTask<String> futreTask = new FutureTask<>(new RealData("task"));

        ExecutorService service = null;
        service = Executors.newFixedThreadPool(2);
        service.submit(futreTask);

        System.out.println("请求完毕...........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("数据: " + futreTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
