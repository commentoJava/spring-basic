package spring.commento.springbasic.chapter03.homework.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    private DeliveryStatus status;
}
