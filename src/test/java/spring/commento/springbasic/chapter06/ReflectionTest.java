package spring.commento.springbasic.chapter06;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class ReflectionTest {

    @Test
    @DisplayName("리플렉션 테스트")
    void reflectionV1() {
        Commento commento = new Commento();

        log.info("\n start");
        log.info("\n result1 = {}", commento.callA());

        log.info("\n start");
        log.info("\n result2 = {}", commento.callB());
    }

    @Slf4j
    static class Commento {
        public String callA() {
            log.info("\n callA");
            return "A";
        }

        public String callB() {
            log.info("\n callB");
            return "B";
        }
    }
}
