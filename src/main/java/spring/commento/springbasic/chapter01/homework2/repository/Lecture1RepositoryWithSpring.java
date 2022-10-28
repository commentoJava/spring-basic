package spring.commento.springbasic.chapter01.homework2.repository;

public interface Lecture1RepositoryWithSpring {

    String insertKey(String key, String value);

    String findByValue(String key);
}
