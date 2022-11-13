package spring.commento.springbasic.chapter03.homework.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Address {

    private String city;

    private int zipcode;

    private String street;

    private String telephone;

}
