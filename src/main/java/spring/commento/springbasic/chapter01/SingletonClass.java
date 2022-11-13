package spring.commento.springbasic.chapter01;

import lombok.Getter;

import java.util.Map;
import java.util.Optional;

@Getter
public class SingletonClass {

    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return instance;
    }

    private static Map<String, String> map = Map.of(
            "name","이름",
            "java", "자바"
    );

    public String insertKey(String key, String value) {
        return map.put(key, value);
    }

    public String findByValue(String key) {
        return Optional.ofNullable(map.get(key)).orElse("COMMENTO");
    }
}
