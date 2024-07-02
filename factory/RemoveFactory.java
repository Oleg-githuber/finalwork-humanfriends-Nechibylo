package factory;

import choice.NumberChoice;
import iterator.AnimalGroupIterator;
import logger.AnimalLogger;
import model.Animal;

import java.util.List;
import java.util.Scanner;

public class RemoveFactory {
    public List<Animal> removeAnimal(Scanner scanner, AnimalLogger logger, List<Animal> animalList) {
        if (animalList.isEmpty()) {
            logger.printWarning("Animal list is empty");
        } else {
            int number = new NumberChoice().selectNumberOfAnimal(scanner, logger, animalList);
            AnimalGroupIterator iterator = new AnimalGroupIterator(animalList);
            while (iterator.hasNext()) {
                Animal animal = iterator.getAnimal();
                if (animal.getTotalNumber() == number) {
                    String name = animal.getName();
                    iterator.remove();
                    logger.printLog(String.format("Animal No %d (%s) removed from the list", number, name));
                    break;
                }
                if (!iterator.hasNext())
                    logger.printWarning("Animal was not found");
                else iterator.next();
            }
        }
        return animalList;
    }
}
