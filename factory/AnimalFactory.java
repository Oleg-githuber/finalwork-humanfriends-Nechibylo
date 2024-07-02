package factory;

import controller.AnimalController;
import controller.CounterController;
import enumeration.Type;
import logger.AnimalLogger;
import model.Animal;
import model.packAnimals.Camel;
import model.packAnimals.Donkey;
import model.packAnimals.Horse;
import model.pets.Cat;
import model.pets.Dog;
import model.pets.Hamster;

import java.util.List;
import java.util.Scanner;

public class AnimalFactory {
    public List<Animal> updateList(Scanner scanner, AnimalLogger logger, CounterController counterController, List<Animal> animalList, Type type) {
        AnimalController animalController = new AnimalController();
        counterController.incrementAnimalCount();
        switch (type) {
            case cat ->
            {
                counterController.incrementPetCount();
                counterController.incrementCatCount();
                animalList.add(new Cat(animalController.enterName(scanner), animalController.enterBirthDate(scanner, logger),
                        counterController.getAnimalCount(), counterController.getPetCount(),
                        counterController.getCatCount(), scanner));
                logger.printLog("The cat added to the list");
            }
            case dog ->
            {
                counterController.incrementPetCount();
                counterController.incrementDogCount();
                animalList.add(new Dog(animalController.enterName(scanner), animalController.enterBirthDate(scanner, logger),
                        counterController.getAnimalCount(), counterController.getPetCount(),
                        counterController.getDogCount(), scanner));
                logger.printLog("The dog added to the list");
            }
            case hamster ->
            {
                counterController.incrementPetCount();
                counterController.incrementHamsterCount();
                animalList.add(new Hamster(animalController.enterName(scanner), animalController.enterBirthDate(scanner, logger),
                        counterController.getAnimalCount(), counterController.getPetCount(),
                        counterController.getHamsterCount(), scanner));
                logger.printLog("The hamster added to the list");
            }
            case horse ->
            {
                counterController.incrementPackAnimalCount();
                counterController.incrementHorseCount();
                animalList.add(new Horse(animalController.enterName(scanner), animalController.enterBirthDate(scanner, logger),
                        counterController.getAnimalCount(), counterController.getPackAnimalCount(),
                        counterController.getHorseCount(), scanner));
                logger.printLog("The horse added to the list");
            }
            case camel ->
            {
                counterController.incrementPackAnimalCount();
                counterController.incrementCamelCount();
                animalList.add(new Camel(animalController.enterName(scanner), animalController.enterBirthDate(scanner, logger),
                        counterController.getAnimalCount(), counterController.getPackAnimalCount(),
                        counterController.getCamelCount(), scanner));
                logger.printLog("The camel added to the list");
            }
            case donkey ->
            {
                counterController.incrementPackAnimalCount();
                counterController.incrementDonkeyCount();
                animalList.add(new Donkey(animalController.enterName(scanner), animalController.enterBirthDate(scanner, logger),
                        counterController.getAnimalCount(), counterController.getPackAnimalCount(),
                        counterController.getDonkeyCount(), scanner));
                logger.printLog("The donkey added to the list");
            }
        }
        return animalList;
    }
}
