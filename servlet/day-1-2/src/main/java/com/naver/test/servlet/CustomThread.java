package com.naver.test.servlet;

import java.util.List;

public class CustomThread implements Runnable{

    public void run() {
        while (true){

            try {
                Thread.sleep(10000 );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // db 에서 업데이트
            LegacyServlet.list.clear();
            for (int i = 0; i < 10; i++) {
                LegacyServlet.list.add(i);
            }
        }

    }
}
