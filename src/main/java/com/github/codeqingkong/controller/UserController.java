package com.github.codeqingkong.controller;

import com.github.codeqingkong.common.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qingkong
 * @date 2021/12/19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/index")
    public ModelAndView index (ModelAndView modelAndView){
        modelAndView.setViewName("user/index");
        return modelAndView;
    }
}
