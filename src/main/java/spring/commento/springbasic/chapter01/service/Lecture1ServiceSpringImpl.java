package spring.commento.springbasic.chapter01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.commento.springbasic.chapter01.repository.Lecture1RepositorySpringImpl;

@Service
public class Lecture1ServiceSpringImpl implements Lecture1ServiceWithSpring{

    @Autowired
    Lecture1RepositorySpringImpl lecture1Repository;

    @Override
    public String getValue(String key) {
        return lecture1Repository.getValue(key);
    }

    @Override
    public String setValue(String key, String value) {
        return lecture1Repository.setValue(key, value);
    }
}
