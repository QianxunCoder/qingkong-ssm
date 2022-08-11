package com.github.codeqingkong.controller;

import com.github.codeqingkong.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @GetMapping("/list")
    public ModelAndView list(ModelAndView modelAndView){
        modelAndView.setViewName("user/list");
        return modelAndView;
    }

    @GetMapping("/detail")
    @ResponseBody
    public UserVO detail(@RequestParam("userId") Integer userId){
        // 省略业务代码
        UserVO userVO = new UserVO();
        return userVO;
    }
}
