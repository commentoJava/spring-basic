package spring.commento.springbasic.chapter02;

import java.util.HashMap;
import java.util.Map;

public class SingletonClass {

    private static final SingletonClass singletonClass = new SingletonClass();

    private static Map<Long, User> map = new HashMap<>();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public Map<Long, User> getMap() {
        return map;
    }
}
