package com.github.codeqingkong.controller;

import cn.hutool.core.util.StrUtil;
import com.github.codeqingkong.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qingkong
 * @date 2021/12/19
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView loginPage(ModelAndView modelAndView) {
        modelAndView.setViewName("login/login");
        return modelAndView;
    }

    @PostMapping("/login")
    @ResponseBody
    public ModelAndView login(@RequestBody UserDTO userDTO) {
        if (!StrUtil.isBlank(userDTO.getUsername()) && !StrUtil.isBlank(userDTO.getPassword())) {
        }
        return null;
    }
}
