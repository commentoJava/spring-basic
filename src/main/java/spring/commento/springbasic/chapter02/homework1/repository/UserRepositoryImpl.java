package spring.commento.springbasic.chapter02.homework1.repository;


import spring.commento.springbasic.chapter02.SingletonClass;
import spring.commento.springbasic.chapter02.homework1.User;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public User findByUserId(Long userId) {
        return SingletonClass.getInstance().getMap().get(userId);
    }

    @Override
    public User addUser(Long userId, User user) {
        return SingletonClass.getInstance().getMap().put(userId, user);
    }

    @Override
    public User updateUser(Long userId, User user) {
        return SingletonClass.getInstance().getMap().replace(userId, user);
    }

    @Override
    public User deleteUser(Long userId) {
        return SingletonClass.getInstance().getMap().remove(userId);
    }
}
