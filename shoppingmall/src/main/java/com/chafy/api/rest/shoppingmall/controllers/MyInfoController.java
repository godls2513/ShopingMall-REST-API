package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class MyInfoController {
    // 내 정보 조회
    @GetMapping("/me")
    public String myInfo(@RequestAttribute String userId) {
        return "내 정보 조회 " + userId;
    }

    // 내 정보 수정
    @PatchMapping("/me")
    public String editMyInfo() {
        return "내 정보 수정\n";
    }

    // 회원가입
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String join() {
        return "회원가입 성공\n";
    }

}
