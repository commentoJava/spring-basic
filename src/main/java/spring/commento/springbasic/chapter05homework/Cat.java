package spring.commento.springbasic.chapter05homework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Cat implements AnimalInterface {
    @Override
    public void call() {
        log.info("야옹");
    }
}
