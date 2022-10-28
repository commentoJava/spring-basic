package spring.commento.springbasic.chapter02;

import lombok.Getter;
import spring.commento.springbasic.chapter02.homework1.User;

import java.util.HashMap;
import java.util.Map;

@Getter
public class SingletonClass {

    private static final SingletonClass instance = new SingletonClass();

    private static Map<Long, User> map = new HashMap<>();

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return instance;
    }
    public Map<Long, User> getMap() {
        return map;
    }
}
