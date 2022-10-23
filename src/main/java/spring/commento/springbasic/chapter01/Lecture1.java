package spring.commento.springbasic.chapter01;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

public class Lecture1 {
    public static Map<String, String> map;

    private Lecture1(){
        map = new HashMap<>();
    }

    private static class SINGLETON_HOLDER{
        private static final Lecture1 INSTANCE = new Lecture1();
    }

    public static Lecture1 getInstance(){
        return SINGLETON_HOLDER.INSTANCE;
    }
}
