package com.qzc.controller;

import com.qzc.dao.UserMapper;

import com.qzc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@RestController//  这个注解相当于controller和responsebody
@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/checkUser")
    @ResponseBody
    public String checkUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User userResult = userMapper.selectUser(user);
        if (user.getUsername() != null && user.getPassword() != null) {
//            response.getWriter().print("欢迎"+user.getUsername()+"!!!!!!!!");
            return "欢迎"+user.getUsername()+"!!!!!!!!";
        }else {
//            response.getWriter().print("用户名或密码错误");
            return "用户名或密码错误";
        }
    }


    @RequestMapping("/index11")

    public ModelAndView index(){
        Map<String ,Object> map=new HashMap<>();
        map.put("date",new Date());
        map.put("message","恭喜登录成功");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("map",map);
        return  modelAndView;
    }
}
