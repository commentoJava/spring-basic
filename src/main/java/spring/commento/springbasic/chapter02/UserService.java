package spring.commento.springbasic.chapter02;

import java.util.List;

public interface UserService {
    public List<User> getUserAll();
    public User getUser(Long id);
    public User putUser(User user);
    public User delUser(Long id);
    public User updateUser(Long id, User user);
}
