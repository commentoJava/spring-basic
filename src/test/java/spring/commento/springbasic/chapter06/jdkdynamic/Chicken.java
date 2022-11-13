package spring.commento.springbasic.chapter06.jdkdynamic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chicken implements Animal{
    @Override
    public void bark(String message) {
        log.info("\n 울음소리 = {}",message);
    }
}
