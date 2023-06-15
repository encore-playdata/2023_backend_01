package com.playdata.todos.config;

import com.playdata.todos.dao.UserDao;

public class LogoutThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        UserDao.me = null;
    }
}
