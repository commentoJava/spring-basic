package spring.commento.springbasic.chapter02;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public class UserMap {

    private static Long id = 0L;

    private final Map<Long, User> map;
    private static class SINGLETON_HOLDER{
        private static final UserMap INSTANCE = new UserMap(new HashMap<>());
    }

    public static UserMap getInstance(){
        return SINGLETON_HOLDER.INSTANCE;
    }

    public synchronized Long getNextId() {
        return ++id;
    }
}
