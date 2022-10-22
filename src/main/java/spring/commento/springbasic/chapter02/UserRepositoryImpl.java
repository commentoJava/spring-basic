package spring.commento.springbasic.chapter02;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static Long id = 0L;
    private SingletonClass singletonClass = SingletonClass.getInstance();

    @Override
    public List<User> getUserAll() {
        Map<Long, User> map = singletonClass.getMap();
        return List.copyOf(map.values());
    }

    @Override
    public User getUser(Long id) {
        Map<Long, User> map = singletonClass.getMap();
        if (!map.containsKey(id)) {
            return null;
        }
        return map.get(id);
    }

    @Override
    public User putUser(User user) {
        Map<Long, User> map = singletonClass.getMap();
        try {
            map.put(id++, user);
        } catch (Exception e) {
            return null;
        }
        return user;
    }

    @Override
    public User delUser(Long id) {
        Map<Long, User> map = singletonClass.getMap();
        if (!map.containsKey(id)) {
            return null;
        }
        return map.remove(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        Map<Long, User> map = singletonClass.getMap();
        if (!map.containsKey(id)) {
            return null;
        }
        return map.replace(id, user);
    }
}
