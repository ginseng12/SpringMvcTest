package com.hll.controller;

import com.hll.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

;

@Controller
@RequestMapping("/user")
public class ParamController {
    private static final Log logger = LogFactory.getLog(ParamController.class);

    private static List<User> userListl;

    public ParamController() {
        userListl = new ArrayList<>();
    }

    /**
     * 跳转到注册页面
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("register Get 方法被调用");
        return "registerFrorm";
    }

    /**
     * 注册页面
     *
     * @param loginname 登录名
     * @param password  登录密码
     * @param username  用户名
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("/loginname") String loginname,
                           @RequestParam("password") String password,
                           @RequestParam("username") String username) {
        logger.info("register POST 方法被调用");
        User user = new User();
        user.setLoginName(loginname);
        user.setPassword(password);
        user.setUserName(username);
        userListl.add(user);
        return "loginForm";
    }

    /**
     * 登录页面
     * @param loginname 登录名
     * @param password 密码
     * @param model
     * @return
     */
    @RequestMapping(value = "login")
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model) {
        logger.info("登录名" + loginname + "密码" + password);
        for (User user : userListl) {
            if (user.getLoginName().equals(loginname)
                    && user.getPassword().equals(password)) {
                model.addAttribute("userform", user);
                return "welcome";
            }
        }
        return "loginForm";
    }

}
