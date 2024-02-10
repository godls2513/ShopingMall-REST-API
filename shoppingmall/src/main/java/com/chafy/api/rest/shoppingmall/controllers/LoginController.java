package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class LoginController {
    // 로그인
    @PostMapping
    public String login() {
        return "로그인 성공";
    }

    // 로그아웃
    @DeleteMapping
    public String logout() {
        return "로그아웃 성공";
    }
}
