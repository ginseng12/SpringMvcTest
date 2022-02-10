package com.hll.controller;

import com.hll.model.ValidUser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("JSR303Test")

public class VaildController {
    private static final Log logger = LogFactory.getLog(VaildController.class);

    @RequestMapping(value = "/{formName}")
    public String validForm(@PathVariable String formName, Model model) {
        ValidUser validUser = new ValidUser();
        model.addAttribute("validUser", validUser);
        return formName;
    }

    @RequestMapping(value = "/valid", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute ValidUser validUser, Errors errors, Model model) {
        logger.info(validUser);
        if (errors.hasErrors()) {
            return "validateForm";
        }
        model.addAttribute("validUser", validUser);
        return "validate";
    }
}
