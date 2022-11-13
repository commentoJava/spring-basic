package spring.commento.springbasic.chapter06.aopincompany;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Slf4j
public class TransactionAspect {

    @Before("@annotation(spring.commento.springbasic.chapter06.aopincompany.TransactionLog)")
    public void transactionLog(JoinPoint joinpoint){
        Object[] args = joinpoint.getArgs();
        log.info("\n [transaction] {} args = {}",joinpoint.getSignature(), args);
    }
}
