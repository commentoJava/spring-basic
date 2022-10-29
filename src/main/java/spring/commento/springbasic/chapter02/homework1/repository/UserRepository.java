package spring.commento.springbasic.chapter02.homework1.repository;


import spring.commento.springbasic.chapter02.homework1.User;

public interface UserRepository {

    User findByUserId(Long userId);
    User addUser(Long userId, User user);
    User updateUser(Long userId, User user);
    User deleteUser(Long userId);
}
