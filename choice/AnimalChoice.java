package choice;

import iterator.AnimalGroupIterator;
import logger.AnimalLogger;
import model.Animal;

import java.util.List;

public class AnimalChoice {
    public Animal SelectAnimal(int number, AnimalLogger logger, List<Animal> animalList) {
        AnimalGroupIterator iterator = new AnimalGroupIterator(animalList);
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getTotalNumber() == number) {
                return animal;
            }
            //iterator.next();
        }
        logger.printWarning("Animal with this number does not exist in the list");

//        for (Animal animal : animalList) {
//            if (animal.getTotalNumber() == number) return animal;
//        }

        return null;
    }
}
