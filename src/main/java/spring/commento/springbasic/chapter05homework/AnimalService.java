package spring.commento.springbasic.chapter05homework;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalFactory animalFactory;
    public void getAnimalSounds(String animalName){
        AnimalInterface animalSounds = animalFactory.getAnimalSounds(animalName);
        animalSounds.call();
    }

}
