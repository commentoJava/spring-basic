package spring.commento.springbasic.chapter01.homework1.repository;

import spring.commento.springbasic.chapter01.SingletonClass;

public class Lecture1RepositoryImpl implements Lecture1RepositoryNoSpring {

    @Override
    public String insertKey(String key, String value) {
        return SingletonClass.getInstance().insertKey(key, value);
    }

    @Override
    public String findByValue(String key) {
        return SingletonClass.getInstance().findByValue(key);
    }
}
