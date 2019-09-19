package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XRom
 * On 11/16/2017.11:59 PM
 */
@Controller
public class TestController {

    @Autowired(required=true)
    private UserService userService;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test() {
        return "test1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return "test2";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public String test3() {
        return "najing/test3";
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    public String test4() {
        return "test4";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
    @ResponseBody
    public String saveUser() {
        userService.saveUser();
        return "success!";
    }
}
