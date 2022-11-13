package spring.commento.springbasic.chapter03.homework.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    ORDER("주문 완료"),
    CANCEL("주문 취소");

    private final String status;
}
