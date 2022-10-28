package spring.commento.springbasic.chapter01.homework2.service;

public interface Lecture1ServiceWithSpring {
    String insertKey(String key, String value);

    String findByKey(String key);

    void homework(String key);
}
