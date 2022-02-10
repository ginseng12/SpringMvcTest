package com.hll.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AnnoController {
    private static final Log logger = LogFactory.getLog(AnnoController.class);

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        logger.info("login 被占用");
        model.addAttribute("message","Login Success");
        return "success";
    }
}
