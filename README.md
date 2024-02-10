# 쇼핑몰 REST API 설계
## 쇼핑몰 REST API 설계 목록

### 로그인/회원가입
- 로그인 POST /session
- 로그아웃 DELETE /session
- 회원가입 POST /join/{user_id}

### 내 정보
- 내 정보 조회 GET /users/me
- 내 정보 수정 PATCH /users/me

### 상품
- 상품 목록 GET /items
- 상품 상세 GET /items/{item_id}

### 상품 리뷰
- 상품 리뷰 작성 POST /itmes/{item_id}/comments
- 상품 리뷰 수정 PATCH /itmes/{item_id}/comments/{comment_id}
- 상품 리뷰 삭제 DELETE /items/{item_id}/comments/{comment_id}

### 장바구니
- 장바구니에 상품 추가 POST /carts/{item_id} 
- 장바구니에 상품 삭제 DELETE /carts/{item_id}
- 장바구니 전체 목록 GET /carts

### 구매
- 주문하기 POST /orders
- 주문목록 GET /orders
