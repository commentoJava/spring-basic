package spring.commento.springbasic.chapter06;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import spring.commento.springbasic.chapter06.aop.AspectV1;
import spring.commento.springbasic.chapter06.aop.AspectV3;
import spring.commento.springbasic.chapter06.aop.AspectV4;
import spring.commento.springbasic.chapter06.aop.OrderRepository;
import spring.commento.springbasic.chapter06.aop.OrderService;

@Slf4j
@SpringBootTest
@Import(AspectV1.class)
//@Import(AspectV2.class)
//@Import(AspectV3.class)
//@Import(AspectV4.class)
public class AopTest {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @Test
    void aopInfo() {
        log.info("isAopProxy, orderService={}",
                 AopUtils.isAopProxy(orderService));
        log.info("isDynamicProxy, orderService = {}",
                 AopUtils.isJdkDynamicProxy(orderService));

        log.info("isAopProxy, orderRepository={}",
                 AopUtils.isAopProxy(orderRepository));

        log.info("isDynamicProxy, orderRepository = {}",AopUtils.isJdkDynamicProxy(orderRepository));
    }

    @Test
    void success() {
        orderService.orderItem("itemA");
    }

}
