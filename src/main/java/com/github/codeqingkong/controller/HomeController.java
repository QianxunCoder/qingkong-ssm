package com.github.codeqingkong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qingkong
 * @date 2021/12/19
 */
@Controller
public class HomeController {
    @RequestMapping("/login_page")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("login/login");
        return modelAndView;
    }
}
