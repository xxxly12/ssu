package com.qzc.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        String name = "lllllly";

        ModelAndView modelAndView = new ModelAndView("hello");
//        model.addAttribute("name", name);
        modelAndView.addObject("name",name);
        return modelAndView;
    }
}
