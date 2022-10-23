package spring.commento.springbasic.chapter02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

@Repository
@Slf4j
public class UserRepositoryImpl implements UserRepository{


    @Override
    public User findUserById(Long id) {
        return UserMap.getInstance().getMap().getOrDefault(id, null);
    }

    @Override
    public void deleteUserById(Long id) {
        UserMap.getInstance().getMap().remove(id);
    }

    @Override
    public void modifyUsernameById(Long id, String username) {
        UserMap.getInstance().getMap().get(id).setUsername(username);
    }

    @Override
    public void addUser(User user) {
        Long id = UserMap.getInstance().getNextId();
        UserMap.getInstance().getMap().put(id, user);
    }
}
