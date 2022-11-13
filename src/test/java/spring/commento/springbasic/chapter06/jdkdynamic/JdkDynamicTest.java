package spring.commento.springbasic.chapter06.jdkdynamic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicTest {

    @Test
    void jdkDynamicV1(){
        Chicken chicken = new Chicken();
        JdkDynamicInvocationHandler jdkDynamicInvocationHandler = new JdkDynamicInvocationHandler(chicken);
        Animal animal = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),
                                                        new Class[]{Animal.class},
                                                        jdkDynamicInvocationHandler);
        animal.bark("animal!");
        chicken.bark("꼬꼬닭");
    }

    @Test
    @DisplayName("인터페이스가 아닌 구현체 대상으로 프록시 만드려고 하면 에러 발생")
    void jdkDynamicV2(){
        Chicken chicken = new Chicken();
        JdkDynamicInvocationHandler jdkDynamicInvocationHandler = new JdkDynamicInvocationHandler(chicken);
        Animal animal = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),
                                                        new Class[]{Chicken.class},
                                                        jdkDynamicInvocationHandler); // 실행시 에러 발생
        animal.bark("animal!");
        chicken.bark("꼬꼬닭");
    }
}