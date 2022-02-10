package com.hll.controller;

import com.hll.model.ConvertUser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/convert")
public class ConvertController {

    private static final Log logger = LogFactory.getLog(ConvertController.class);

    @RequestMapping(value = "{formName}")
    public String loginName(@PathVariable String formname){

        return formname;
    }

    @RequestMapping(value = "/convertLogin",method = RequestMethod.POST)
    public String register(@ModelAttribute ConvertUser user, Model model){
        logger.info(user);
        model.addAttribute("user",user);
        return "convert";
    }
}
