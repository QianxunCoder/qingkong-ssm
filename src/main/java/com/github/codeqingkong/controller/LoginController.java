package com.github.codeqingkong.controller;

import cn.hutool.core.util.StrUtil;
import com.github.codeqingkong.common.Result;
import com.github.codeqingkong.dto.UserDTO;
import com.github.codeqingkong.model.User;
import com.github.codeqingkong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public ModelAndView loginPage(ModelAndView modelAndView) {
        // 跳转登录页面
        modelAndView.setViewName("login/login");
        return modelAndView;
    }

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody UserDTO userDTO) {
        if (!StrUtil.isBlank(userDTO.getUsername()) && !StrUtil.isBlank(userDTO.getPassword())) {
            // 查询数据库获取用户信息
            User user = userService.getOneUserByUsername(userDTO.getUsername());
            if (user == null) {
                // 打印日志
                return new Result(401, "The user or password is incorrect", null);
            } else {
                // 对比密码
                if (user.getPassword().equals(userDTO.getPassword())) {
                    return Result.ok();
                } else {
                    // 打印日志
                    return new Result(401, "The user or password is incorrect", null);
                }
            }
        } else {
            return new Result(400, "Username or password cannot be empty", null);
        }
    }
}
