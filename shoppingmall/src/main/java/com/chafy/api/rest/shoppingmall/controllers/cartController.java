package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class cartController {
    // 장바구니 목록
    @GetMapping("/")
    public String list(@RequestAttribute String userId) {
        return userId + " 의 장바구니 목록\n";
    }

    // 장바구니에 상품 추가
    @PostMapping("/{item_id}")
    public String addItem(
            @RequestAttribute String userId,
            @PathVariable("item_id") String id) {
        return userId + "의 장바구니에 상품 " + id + "(이)가 추가\n";
    }

    // 장바구니 상품 삭제
    @DeleteMapping("/{item_id}")
    public String deleteItem(
            @RequestAttribute String userId,
            @PathVariable("item_id") String id) {
        return userId + "의 장바구니에 상품 " + id + "(이)가 삭제\n";
    }
}
