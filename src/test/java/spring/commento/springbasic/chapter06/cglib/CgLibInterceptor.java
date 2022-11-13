package spring.commento.springbasic.chapter06.cglib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class CgLibInterceptor implements MethodInterceptor {
    private final Animal animal;

    public CgLibInterceptor(Animal animal) {
        this.animal = animal;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("\n ===== BEFORE =====");
        method.invoke(animal,objects);
        log.info("\n ===== AFTER =====");
        return null;
    }
}
