package spring.commento.springbasic.chapter02.homework1.service;

import spring.commento.springbasic.chapter02.homework1.User;

public interface UserService {
    User findByUserId(Long userId);
    User addUser(Long userId, User user);
    User updateUser(Long userId, User user);
    User deleteUser(Long userId);
}
