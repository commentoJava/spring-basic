package spring.commento.springbasic.chapter02.homework1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Min;

@AllArgsConstructor
@Getter
public class User {

    private String username;

    private String email;

    @Min(value = 14)
    private int age;

    private String address;

    private String phoneNumber;

    private Gender gender;
}
