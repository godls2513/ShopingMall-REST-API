package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    // 로그인
    @PostMapping("/session")
    public String login() {
        return "로그인 성공";
    }

    // 로그아웃
    @DeleteMapping("/session")
    public String logout() {
        return "로그아웃 성공";
    }

    // 회원가입
    @PostMapping("/join/{user_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String join(@PathVariable("user_id") String id) {
        return "회원가입 성공 : " + id;
    }
}
