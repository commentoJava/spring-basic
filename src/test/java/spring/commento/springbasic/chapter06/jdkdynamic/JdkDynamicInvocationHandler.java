package spring.commento.springbasic.chapter06.jdkdynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class JdkDynamicInvocationHandler implements InvocationHandler {
    private Animal animal;

    public JdkDynamicInvocationHandler(Animal animal) {
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("\n ====== BEFORE ======");
        method.invoke(animal,args);
        log.info("\n ====== AFTER ======");
        return null;
    }
}
