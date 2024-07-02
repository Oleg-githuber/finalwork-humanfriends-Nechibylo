package model;

import enumeration.Type;
import iterator.AnimalGroupIterator;
import logger.AnimalLogger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AnimalGroup implements Iterable<Animal> {
    List<Animal> animalList;

    public AnimalGroup() {
        this.animalList = new ArrayList<>();
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = new ArrayList<>(animalList);
    }

    private int chooseType(Scanner scanner, AnimalLogger logger) {
        int choiceNumber = 0;
        while (choiceNumber < 1 || choiceNumber > Type.values().length) {
            System.out.println("Выберите тип животного:");
            int i = 0;
            for (Type type : Type.values()) {
                System.out.printf("%d - ", ++i);
                System.out.println(type);
            }
            System.out.println("Введите цифру, соответствующую типу животного:");
            try {
                choiceNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                logger.printWarning("Введено некорректное значение.");
            }
        }
        return choiceNumber;
    }

    public Type chooseAnimal(Scanner scanner, AnimalLogger logger) {
        int choiceNumber = chooseType(scanner, logger);
        Type animalType = null;
        switch (choiceNumber) {
            case 1:
                animalType = Type.dog;
                logger.printLog("Chosen type is Dog");
                break;
            case 2:
                animalType = Type.cat;
                logger.printLog("Chosen type is Cat");
                break;
            case 3:
                animalType = Type.hamster;
                logger.printLog("Chosen type is Hamster");
                break;
            case 4:
                animalType = Type.horse;
                logger.printLog("Chosen type is Horse");
                break;
            case 5:
                animalType = Type.camel;
                logger.printLog("Chosen type is Camel");
                break;
            case 6:
                animalType = Type.donkey;
                logger.printLog("Выбранный тип - Donkey");
                break;
            default:
                logger.printWarning("You entered incorrect value");
                break;
        }
        return animalType;
    }

    public void addAnimalToList(Animal animal) {
        animalList.add(animal);
    }

    @Override
    public Iterator<Animal> iterator() {
        return new AnimalGroupIterator(this.animalList);
    }
}
