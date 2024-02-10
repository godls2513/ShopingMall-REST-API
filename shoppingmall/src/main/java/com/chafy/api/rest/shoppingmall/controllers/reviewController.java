package com.chafy.api.rest.shoppingmall.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items/{item_id}")
public class reviewController {

    // 상품 리뷰 작성
    @PostMapping("/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public String postReview(@PathVariable("item_id") String id) {
        return id + " 상품의 " + "댓글 작성!!";
    }

    // 상품 리뷰 수정
    @PatchMapping("/comments/{comment_id}")
    public String editReview(@PathVariable("item_id") String item_id, @PathVariable("comment_id") String comment_id) {
        return item_id + " 상품의 " + comment_id + "댓글 작성!!";
    }

    // 상품 댓글 삭제
    @DeleteMapping("/comments/{comment_id}")
    public String deleteReview(@PathVariable("item_id") String item_id, @PathVariable("comment_id") String comment_id) {
        return item_id + " 상품의 " + comment_id + " 댓글 삭제!!";
    }
}
