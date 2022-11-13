package spring.commento.springbasic.chapter01.homework1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.commento.springbasic.chapter01.homework2.service.Lecture1ServiceSpringImpl;

@SpringBootTest
@Slf4j
public class HomeWork1_2 {

    @Autowired
    Lecture1ServiceSpringImpl lecture1ServiceSpring;

    @Test
    void findByValue() {
        log.info(lecture1ServiceSpring.findByKey("name"));
    }

    @Test
    void insertKey() {
        lecture1ServiceSpring.insertKey("hi","hello");
    }

    @Test
    void homework1_1() {
        lecture1ServiceSpring.homework("test");
    }
}
