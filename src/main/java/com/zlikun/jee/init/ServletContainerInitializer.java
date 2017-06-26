package com.zlikun.jee.init;

import com.zlikun.jee.web.EncodingFilter;
import com.zlikun.jee.web.HelloServlet;
import com.zlikun.jee.web.CustomSessionListener;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2017/6/26 21:40
 */
@HandlesTypes({EncodingFilter.class ,HelloServlet.class ,CustomSessionListener.class})
public class ServletContainerInitializer implements javax.servlet.ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

        // 这里实现动态加载Servlet、Filter、Listener等
        // 动态加载Filter
        FilterRegistration.Dynamic fr = ctx.addFilter("encoding" ,new EncodingFilter()) ;
        fr.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST ,DispatcherType.INCLUDE ,DispatcherType.FORWARD) ,true ,"helloServlet");

        // 动态加载Servlet
        ServletRegistration.Dynamic sr = ctx.addServlet("helloServlet" ,new HelloServlet()) ;
        sr.addMapping("/hello") ;

        // 动态加载Listener
        ctx.addListener(new CustomSessionListener());


    }

}