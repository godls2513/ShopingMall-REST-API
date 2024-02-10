package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class cartController {
    // 장바구니 목록
    @GetMapping("/")
    public String list() {
        return "장바구니 목록\n";
    }

    // 장바구니에 상품 추가
    @PostMapping("/{item_id}")
    public String addItem(@PathVariable("item_id") String id) {
        return "장바구니에 상품 추가\n";
    }

    // 장바구니 상품 삭제
    @DeleteMapping("/{item_id}")
    public String deleteItem(@PathVariable("item_id") String id) {
        return "장바구니에 상품 삭제\n";
    }
}
