package spring.commento.springbasic.chapter03.homework.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int quantity;

    private int price;

    private String category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "homeworkcompany_id")
    private HomeworkCompany homeworkCompany;
}
