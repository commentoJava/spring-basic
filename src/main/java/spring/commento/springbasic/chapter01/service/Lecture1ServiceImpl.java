package spring.commento.springbasic.chapter01.service;

import lombok.extern.slf4j.Slf4j;
import spring.commento.springbasic.chapter01.repository.Lecture1RepositoryImpl;

@Slf4j
public class Lecture1ServiceImpl implements Lecture1ServiceNoSpring{
    Lecture1RepositoryImpl lecture1RepositoryImpl;

    public Lecture1ServiceImpl(Lecture1RepositoryImpl lecture1RepositoryImpl) {
        this.lecture1RepositoryImpl = lecture1RepositoryImpl;
    }

    @Override
    public String getValue(String key) {
        return this.lecture1RepositoryImpl.getValue(key);
    }

    @Override
    public String setValue(String key, String value) {
        return this.lecture1RepositoryImpl.setValue(key, value);
    }

    @Override
    public void homework(String key) {
      log.info("Lecture 1 과제입니다. {}", this.lecture1RepositoryImpl.getValue(key));
    }
}
