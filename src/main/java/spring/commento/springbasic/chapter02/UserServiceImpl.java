package spring.commento.springbasic.chapter02;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteUserById(id);
    }

    @Override
    public void modifyUsernameById(Long id, String username) {
        userRepository.modifyUsernameById(id, username);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }
}
