package com.zlikun.jee.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2017/6/26 21:37
 */
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.getWriter().print("{\"message\":\"Hello Servlet !\"}");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}