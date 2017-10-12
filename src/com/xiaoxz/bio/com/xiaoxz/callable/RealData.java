package com.xiaoxz.bio.com.xiaoxz.callable;

import java.util.concurrent.Callable;

public class RealData implements Callable<String> {

    private String data;

    public RealData(String data) {
        this.data = data;
    }

    @Override
    public String call() throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<10; i++) {
            sb.append(data);
        }
        return sb.toString();
    }
}
