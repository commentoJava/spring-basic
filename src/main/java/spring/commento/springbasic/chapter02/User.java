package spring.commento.springbasic.chapter02;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String username;
    private String pwd;
    private int age;
}

