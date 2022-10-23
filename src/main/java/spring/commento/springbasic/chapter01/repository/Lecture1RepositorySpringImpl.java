package spring.commento.springbasic.chapter01.repository;

import org.springframework.stereotype.Component;
import spring.commento.springbasic.chapter01.Lecture1;

@Component
public class Lecture1RepositorySpringImpl implements Lecture1RepositoryWithSpring{
    @Override
    public String getValue(String key) {
        if (!Lecture1.getInstance().map.containsKey(key)) {
            return "COMMENTO";
        }

        return Lecture1.getInstance().map.get(key);
    }

    @Override
    public String setValue(String key, String value) {
        return Lecture1.getInstance().map.put(key, value);
    }
}
