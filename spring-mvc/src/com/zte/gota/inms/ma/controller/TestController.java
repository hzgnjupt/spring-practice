package com.zte.gota.inms.ma.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public ModelAndView bar(HttpServletRequest request, HttpServletResponse response) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("params", request.getParameterMap());
        return new ModelAndView("output", modelMap);
    }

}
