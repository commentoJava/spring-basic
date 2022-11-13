package spring.commento.springbasic.chapter02.homework1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.commento.springbasic.chapter02.homework1.User;
import spring.commento.springbasic.chapter02.homework1.repository.UserRepositoryImpl;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepositoryImpl userRepository;

    @Override
    public User findByUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public User addUser(Long userId, User user) {
        return userRepository.addUser(userId, user);
    }

    @Override
    public User updateUser(Long userId, User user) {
        return userRepository.updateUser(userId, user);
    }

    @Override
    public User deleteUser(Long userId) {
        return userRepository.deleteUser(userId);
    }
}
