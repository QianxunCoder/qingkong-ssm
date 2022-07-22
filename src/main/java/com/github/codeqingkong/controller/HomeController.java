package com.github.codeqingkong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**首页控制器
 * @author qingkong
 * @date 2021/12/19
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("");
        return modelAndView;
    }
}
