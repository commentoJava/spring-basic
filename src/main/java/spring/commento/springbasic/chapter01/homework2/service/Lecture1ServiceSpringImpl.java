package spring.commento.springbasic.chapter01.homework2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.commento.springbasic.chapter01.SingletonClass;
import spring.commento.springbasic.chapter01.homework2.repository.Lecture1RepositorySpringImpl;

@Slf4j
@Service
@RequiredArgsConstructor
public class Lecture1ServiceSpringImpl implements Lecture1ServiceWithSpring{

    private final Lecture1RepositorySpringImpl lecture1RepositorySpring;

    @Override
    public String insertKey(String key, String value) {
        return lecture1RepositorySpring.insertKey(key, value);
    }

    @Override
    public String findByKey(String key) {
        return lecture1RepositorySpring.findByValue(key);
    }

    @Override
    public void homework(String key) {
        log.info("Lecture 1 과제 입니다." + SingletonClass.getInstance().findByValue(key));
    }
}
