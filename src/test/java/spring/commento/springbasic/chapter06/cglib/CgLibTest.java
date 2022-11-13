package spring.commento.springbasic.chapter06.cglib;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

@Slf4j
public class CgLibTest {

    @Test
    void cglibTest(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Chicken.class);
        enhancer.setCallback(new CgLibInterceptor(new Chicken()));
        Chicken chicken = (Chicken) enhancer.create();
        chicken.bark("cglib 꼬꼬");

    }
}
