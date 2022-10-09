package spring.commento.springbasic.chapter01.homework1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.commento.springbasic.chapter01.service.Lecture1ServiceSpringImpl;

@Slf4j
@SpringBootTest
public class HomeWork1_2 {

    @Autowired
    Lecture1ServiceSpringImpl lecture1ServiceSpring;

    @Test
    void setAndGetValue() {
        lecture1ServiceSpring.setValue("test", "1");
        log.info("setAndGetValue result: {}", lecture1ServiceSpring.getValue("test").equals("1"));
    }

    @Test
    void getDefaultValue() {
        log.info("getDefaultValue result: {}", lecture1ServiceSpring.getValue("test").equals("COMMENTO"));
    }
}
