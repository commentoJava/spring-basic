package spring.commento.springbasic.chapter06.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* spring.commento.springbasic.chapter06.aop..*(..))")
    public Object Log(ProceedingJoinPoint joinPoint) throws Throwable { //log는 어드바이스
        log.info("\n [log ] {}", joinPoint.getSignature()); // join point 시그니처
        return joinPoint.proceed();
    }
}
