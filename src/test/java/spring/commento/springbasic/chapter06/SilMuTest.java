package spring.commento.springbasic.chapter06;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import spring.commento.springbasic.chapter06.aopincompany.RetryAspect;
import spring.commento.springbasic.chapter06.aopincompany.SilMuService;
import spring.commento.springbasic.chapter06.aopincompany.TransactionAspect;

@SpringBootTest
@Import({TransactionAspect.class, RetryAspect.class})
public class SilMuTest {

    @Autowired
    SilMuService service;


    @Test
    void silMuIterator(){
        for(int i=0; i<100; i++){
            service.save("data " + i);
        }
    }
}
