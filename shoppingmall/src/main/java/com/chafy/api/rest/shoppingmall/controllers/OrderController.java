package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    // 주문목록
    @GetMapping("/")
    public String orderList() {
        return "주문 목록\n";
    }

    // 주문하기
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED:)
    public String order() {
        return "주문하기";
    }
}
