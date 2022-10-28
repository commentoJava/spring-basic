package spring.commento.springbasic.chapter01.homework1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import spring.commento.springbasic.chapter01.homework1.repository.Lecture1RepositoryImpl;
import spring.commento.springbasic.chapter01.homework1.service.Lecture1ServiceImpl;

@Slf4j
public class HomeWork1_1 {

    Lecture1ServiceImpl lecture1Service = new Lecture1ServiceImpl(new Lecture1RepositoryImpl());

    @Test
    void findByValue() {
        log.info(lecture1Service.findByKey("name"));
    }

    @Test
    void insertKey() {
        lecture1Service.insertKey("hi","hello");
    }

    @Test
    void homework1_1() {
        lecture1Service.homework("test");
    }
}
