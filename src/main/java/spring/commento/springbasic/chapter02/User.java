package spring.commento.springbasic.chapter02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class User {
    private String username;
    private String email;
    private int age;
    private String address;
    private String phoneNumber;
    private Gender gender;
}
