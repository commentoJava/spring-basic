package spring.commento.springbasic.chapter06.aopincompany;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class RetryAspect {

    @Around("@annotation(retry)")
    public Object doRetry(ProceedingJoinPoint proceedingJoinPoint, Retry retry) throws Throwable {
        log.info("\n [retry] {} , retry ={}", proceedingJoinPoint.getSignature(), retry);
        int maxRetry = retry.value();
        Exception exception = null;
        for (int retryCnt = 1; retryCnt <= maxRetry; retryCnt++) {
            try {
                log.info("\n [retry] try count = {} / {}", retryCnt, maxRetry);
                return proceedingJoinPoint.proceed();
            } catch (Exception e) {
                exception = e;
            }
        }
        throw exception;
    }
}
