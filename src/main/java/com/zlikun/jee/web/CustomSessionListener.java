package com.zlikun.jee.web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2017/6/26 21:49
 */
public class CustomSessionListener implements HttpSessionListener {


    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("创建session ..");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("销毁session ..");
    }
}