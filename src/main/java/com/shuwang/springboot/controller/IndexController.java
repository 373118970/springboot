package com.shuwang.springboot.controller;

import com.shuwang.springboot.base.Author;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Index")
public class IndexController {
    @GetMapping("/Index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        return view;
    }

    @GetMapping("/Index2")
    public String index2() {
//        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
//        view.setViewName("index");
        return "index";
    }
}
