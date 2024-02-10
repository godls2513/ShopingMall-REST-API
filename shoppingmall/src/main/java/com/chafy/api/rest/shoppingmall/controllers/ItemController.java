package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    // 상품 목록
    @GetMapping("/")
    public String items() {
        return "상품 목록\n";
    }

    // 상품 상세
    @GetMapping("/{item_id}")
    public String detailItem(@PathVariable("item_id") String id) {
        return id + "의 상품 상세\n";
    }
}
