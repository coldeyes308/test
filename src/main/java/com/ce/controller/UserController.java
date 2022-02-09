package com.ce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 */
@Controller
public class UserController {

    /**
     * 获取用户所有信息
     * @return
     */
    @GetMapping("/user")
    public String list(){
        return "";
    }

    /**
     * 新增一个用户
     * @return
     */
    @PostMapping("/user")
    public String insert(){
        return "";
    }

    /**
     * 更新一个用户
     * @return
     */
    @PutMapping("/user")
    public String update(){
        return "";
    }

    /**
     * 删除一个用户
     * @return
     */
    @DeleteMapping("/user")
    public String delete(){
        return "";
    }
}
