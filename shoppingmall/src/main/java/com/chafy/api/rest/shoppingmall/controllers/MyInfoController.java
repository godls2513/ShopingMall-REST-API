package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class MyInfoController {
    // 내 정보 조회
    @GetMapping("/me")
    public String myInfo() {
        return "내 정보 조회";
    }

    // 내 정보 수정
    @PatchMapping("/me")
    public String editMyInfo() {
        return "내 정보 수정";
    }
}
