package com.hll.controller;

import com.hll.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class InterController {

    private static final Log logger = LogFactory.getLog(InterController.class);

    public ModelAndView login(String loginname, String password, ModelAndView mv , HttpSession session) {
        if (loginname != null && password != null && loginname.equals("hll") &&password.equals("123456")){
            User user = new User();
            user.setLoginName(loginname);
            user.setPassword(password);
            user.setUserName("admin");
            session.setAttribute("interUser",user);
            mv.setViewName("redirect:main");
        }else {
            mv.addObject("message","账号或密码输入错误，请重新输入");
            mv.setViewName("interForm");
        }
        return mv;
    }
    @RequestMapping(value = "/interForm")
    public String interForm(){
        return "interForm";
    }

    @RequestMapping(value = "/main")
    public String main(Model model){
        model.addAttribute("main:","登录成功");
        return "main";
    }

}
