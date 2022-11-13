package spring.commento.springbasic.chapter06.aopincompany;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SilMuService {
    private final SilMuRepository silMuRepository;

//    @TransactionLog
    public String save(String itemId){
        return silMuRepository.save(itemId);
    }
}
