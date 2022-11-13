package spring.commento.springbasic.chapter01.homework1.service;

import lombok.RequiredArgsConstructor;
import spring.commento.springbasic.chapter01.SingletonClass;
import spring.commento.springbasic.chapter01.homework1.repository.Lecture1RepositoryImpl;

@RequiredArgsConstructor
public class Lecture1ServiceImpl implements Lecture1ServiceNoSpring {

    private final Lecture1RepositoryImpl lecture1Repository;

    @Override
    public String insertKey(String key, String value) {
        return lecture1Repository.insertKey(key, value);
    }

    @Override
    public String findByKey(String key) {
        return lecture1Repository.findByValue(key);
    }

    @Override
    public void homework(String key) {
        System.out.print("Lecture 1 과제 입니다."+ SingletonClass.getInstance().findByValue(key) + " ");
    }
}
