package com.hll.controller;

import com.hll.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    @ModelAttribute
    public void userModel(String loginName, String password, ModelAndView modelAndView) {
        logger.info("userModel");
        User user = new User();
        user.setUserName(loginName);
        user.setPassword(password);
        modelAndView.addObject("user", user);
    }

    @RequestMapping("/login")
    public String login(Model model) {
        logger.info("login");
        User user = (User) model.asMap().get("user");
        System.out.println(user);
        user.setDescirbe("Model 测试");
        return "mode";
    }

}
