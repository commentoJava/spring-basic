package spring.commento.springbasic.chapter02;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUserAll() {
        return userRepository.getUserAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    @Override
    public User putUser(User user) {
        return userRepository.putUser(user);
    }

    @Override
    public User delUser(Long id) {
        return userRepository.delUser(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        return userRepository.updateUser(id, user);
    }


}
