package spring.commento.springbasic.chapter01.repository;

import spring.commento.springbasic.chapter01.Lecture1;

public class Lecture1RepositoryImpl implements Lecture1RepositoryNoSpring{

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
