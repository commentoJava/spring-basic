package spring.commento.springbasic.chapter03.homework.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class HomeworkCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "homeworkCompany", cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();
}
