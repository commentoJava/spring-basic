package spring.commento.springbasic.chapter02;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
public class UserMap {

    private long id = 0;

    private final Map<Long, User> map = new HashMap<>();
    private static class SINGLETON_HOLDER{
        private static final UserMap INSTANCE = new UserMap();
    }

    public static UserMap getInstance(){
        return SINGLETON_HOLDER.INSTANCE;
    }

    public synchronized long getNextId() {
        return ++id;
    }
}
