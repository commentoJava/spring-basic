package spring.commento.springbasic.chapter05homework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
@Slf4j
public class AnimalFactory {

    private final Map<String,AnimalInterface> animalInterfaceMap = new HashMap<>();


    //Dog Mouse Cat
    public AnimalFactory(Set<AnimalInterface> animalInterfaceSet) {
        animalInterfaceSet.forEach(
            animal -> this.animalInterfaceMap.put(animal.getClass().getSimpleName().toUpperCase(), animal )
        );

//        for (AnimalInterface animalInterface : animalInterfaceSet) {
//            animalInterfaceMap.put(animalInterface.getClass().getSimpleName().toUpperCase(), animalInterface);
//        }
    }

    public AnimalInterface getAnimalSounds(String animalName){
        animalName = animalName.toUpperCase();
        return animalInterfaceMap.get(animalName);
    }
}
