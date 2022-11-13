package spring.commento.springbasic.chapter01.homework2.repository;

import org.springframework.stereotype.Component;
import spring.commento.springbasic.chapter01.SingletonClass;

@Component
public class Lecture1RepositorySpringImpl implements Lecture1RepositoryWithSpring{

    @Override
    public String insertKey(String key, String value) {
        return SingletonClass.getInstance().insertKey(key,value);
    }

    @Override
    public String findByValue(String key) {
        return SingletonClass.getInstance().findByValue(key);
    }
}
