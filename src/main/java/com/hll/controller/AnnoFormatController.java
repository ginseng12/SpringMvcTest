package com.hll.controller;

import com.hll.model.FormatModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/annoFormat")
public class AnnoFormatController {

    private static final Log logger = LogFactory.getLog(AnnoFormatController.class);

    @RequestMapping(value = "/{formName}")
    public String loginName(@PathVariable String formName){

        return formName;
    }
    @RequestMapping(value = "/annoFormatLogin",method = RequestMethod.POST)

    public String register(@ModelAttribute FormatModel formatModel, Model model){
        logger.info(formatModel);
        model.addAttribute("formatModel",formatModel);
        return "annoFormat";
    }
}
