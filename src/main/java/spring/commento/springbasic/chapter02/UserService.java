package spring.commento.springbasic.chapter02;

public interface UserService {
    User findUserById(Long id);
    void deleteUserById(Long id);
    void modifyUsernameById(Long id, String username);
    void addUser(User user);
}
