package spring.commento.springbasic.chapter03.homework.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DeliveryStatus {

    SHIPPING("배송 중"),
    COMPLETED("배송 완료");

    private final String status;

}
