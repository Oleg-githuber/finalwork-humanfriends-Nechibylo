package controller;

import choice.AnimalChoice;
import choice.NumberChoice;
import enumeration.Type;
import factory.AnimalFactory;
import factory.RemoveFactory;
import iterator.AnimalGroupIterator;
import logger.AnimalLogger;
import model.AnimalGroup;
import model.Animal;
import model.packAnimals.Camel;
import model.packAnimals.Donkey;
import model.packAnimals.Horse;
import model.pets.Cat;
import model.pets.Dog;
import model.pets.Hamster;
import service.AnimalGroupService;
import view.AnimalView;
import view.CommandsView;
import view.CountView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalGroupController {
    private AnimalGroup animalGroup;
    private List<Animal> animalList;
    private CounterController counterController;

    public AnimalGroupController() {
        this.animalGroup = new AnimalGroup();
        this.animalList = animalGroup.getAnimalList();
        counterController = new CounterController();
    }

//    public void updateAnimalList() {
//        animalGroup.setAnimalList(this.animalList);
//    }

    // Метод, добавляющий животное в список
    public void addAnimal(Scanner scanner, AnimalLogger logger) {
        Type type = animalGroup.chooseAnimal(scanner, logger);
        this.animalList = new ArrayList<>(new AnimalFactory().updateList(scanner, logger, counterController, animalList, type));
        animalGroup.setAnimalList(this.animalList);
    }

    // Метод вывода на экран списка животных
    public void printAnimals() {
        new AnimalView().printAnimalInList(this.animalList);
    }

    // Метод сортировки списка по дате рождения
    public void sortListByBirthDate() {
        AnimalGroupService service = new AnimalGroupService(animalGroup);
        this.animalList = new ArrayList<>(service.sortAnimalsByBirthDate());
    }

    // Метод, отменяющий сортировку по дате рождения, то есть сортирующий по номеру
    public void noSortList() {
        AnimalGroupService service = new AnimalGroupService(animalGroup);
        this.animalList = new ArrayList<>(service.sortAnimalsByNumber());
    }

    // Метод выбора животного по номеру
    private Animal SelectAnimal(int number, AnimalLogger logger) {
        return new AnimalChoice().SelectAnimal(number, logger, animalList);
    }

    // Метод ввода номера животного для выбора его из списка
    private int selectNumberOfAnimal(Scanner scanner, AnimalLogger logger) {
        printAnimals();
        return new NumberChoice().selectNumberOfAnimal(scanner, logger, animalList);
    }

    // Метод обучения животного новым командам
    public void learnCommands(Scanner scanner, AnimalLogger logger) {
        if (!animalList.isEmpty()) {
            Animal animal = SelectAnimal(selectNumberOfAnimal(scanner, logger), logger);
            new CommandsController().learnCommands(scanner, logger, animal);
        } else logger.printWarning("The list is empty");

    }

    public void removeAnimal(Scanner scanner, AnimalLogger logger) {
        if (!animalList.isEmpty()) {
            animalList = new ArrayList<>(new RemoveFactory().removeAnimal(scanner, logger, animalList));
            animalGroup.setAnimalList(animalList);
        }

        else logger.printWarning("The list is empty");
    }

    // Метод вывода на экран команд, которым обучено животное
    public void showCommands(Scanner scanner, AnimalLogger logger) {
        if (!animalList.isEmpty()) {
            Animal animal = SelectAnimal(selectNumberOfAnimal(scanner, logger), logger);
            new CommandsView().showCommands(scanner, logger, animal);
        }else logger.printWarning("The list is empty");
    }

    // Метод вывода на экран счётчиков животных
    public void printCount() {
        new CountView().printCount(counterController);
    }
}
