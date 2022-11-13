package spring.commento.springbasic.chapter01.homework1.repository;

public interface Lecture1RepositoryNoSpring {

    String insertKey(String key, String value);

    String findByValue(String key);
}
