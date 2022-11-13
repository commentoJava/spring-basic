package spring.commento.springbasic.chapter06.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* spring.commento.springbasic.chapter06.aop..*(..))")
    public void allOrder() {
    }

    //타입 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    //allOrder && allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {
    }
}


