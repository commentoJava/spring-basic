package spring.commento.springbasic.chapter01.homework1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import spring.commento.springbasic.chapter01.repository.Lecture1RepositoryImpl;
import spring.commento.springbasic.chapter01.service.Lecture1ServiceImpl;

@Slf4j
public class HomeWork1_1 {

    @Test
    void setAndGetValue() {
        Lecture1ServiceImpl lecture1Service = new Lecture1ServiceImpl(new Lecture1RepositoryImpl());
        lecture1Service.setValue("test", "1");
        log.info("setAndGetValue result: {}", lecture1Service.getValue("test").equals("1"));
    }

    @Test
    void getDefaultValue() {
        Lecture1ServiceImpl lecture1Service = new Lecture1ServiceImpl(new Lecture1RepositoryImpl());
        log.info("getDefaultValue result: {}", lecture1Service.getValue("test").equals("COMMENTO"));
    }

    @Test
    void homework() {
        Lecture1ServiceImpl lecture1Service = new Lecture1ServiceImpl(new Lecture1RepositoryImpl());
        lecture1Service.homework("test");
    }
}
