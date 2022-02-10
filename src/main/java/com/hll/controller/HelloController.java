package com.hll.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse respone)throws Exception{

        logger.info("handleRequest 被调用");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello World!");
        modelAndView.setViewName("/WEB-INF/content/welcome.jsp");

        return modelAndView;
    }
}
