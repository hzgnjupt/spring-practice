package com.zte.gota.inms.mb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value = "/foo")
    public ModelAndView foo() {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("str", "foo");
        return new ModelAndView("output", modelMap);
    }

    @RequestMapping(value = "/bar")
    public ModelAndView bar() {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("str", "bar");
        return new ModelAndView("output", modelMap);
    }

}
