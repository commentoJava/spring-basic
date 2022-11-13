package spring.commento.springbasic.chapter06.aopincompany;

import org.springframework.stereotype.Repository;

@Repository
public class SilMuRepository {

    private static int count = 0;

    /**
     * 5번에 한번 실패하는 요청입니다
     */

    @Retry
    public String save(String itemId){
        count++;
        if(count % 5 ==0)
            throw new IllegalStateException("간헐적 예외가 발생했습니다");
        return itemId;
    }
}
