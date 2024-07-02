package controller;

import enumeration.MenuEnum;
import logger.AnimalLogger;
import view.MenuView;

import java.util.Scanner;
import java.util.logging.Logger;

// Основной контроллер. Вызывается из главного метода
public class MenuController {
    AnimalGroupController groupController;  // Контроллер группы животных
    AnimalLogger logger = new AnimalLogger();

    public MenuController() {
        this.groupController = new AnimalGroupController();
    }


// Метод, возвращающий значение перечисления для выбора режима работы программы
    private MenuEnum menuNavigation(Scanner scanner) {
        while (true) {
            new MenuView().printMenu();
            String command = scanner.nextLine();
            command = command.toLowerCase();
            switch (command) {
                case "add":
                    logger.printLog("Switched mode of addition animal to the list");
                    return MenuEnum.addAnimal;
                case "show":
                    logger.printLog("Switched mode of output the list of command of the animal");
                    return MenuEnum.show;
                case "learn":
                    logger.printLog("Switched mode of learning the animal to new commands");
                    return MenuEnum.learnCommands;
                case "print":
                    logger.printLog("Switched mode of output the list of animals");
                    return MenuEnum.printAnimalList;
                case "sort":
                    return MenuEnum.sortByBirthDate;
                case "nosort":
                    return MenuEnum.sortByNumber;
                case "count":
                    logger.printLog("Switched mode of output information about value of the animals");
                    return MenuEnum.printCount;
                case "remove":
                    logger.printLog("Switched mode of removing the animal from the list");
                    return MenuEnum.remove;
                case "exit":
                    return MenuEnum.exit;
                default:
                    logger.printWarning("You enter incorrect command");
            }
        }
    }

    // Метод, добавляющий животное в список
    private void addAnimal(Scanner scanner) {
        groupController.addAnimal(scanner, logger);
    }

    // Метод, выводящий список животных на экран
    private void printAnimalList() {
        groupController.printAnimals();
        logger.printLog("The list is send to the console");
    }

    // Метод, сортирующий животных по дате рождения
    private void sortAnimals() {
        groupController.sortListByBirthDate();
        logger.printLog("The list is sorted by birthdate");
    }

    // Метод, сортирующий животных по номеру
    private void noSortAnimals() {
        groupController.noSortList();
        logger.printLog("The list is sorted by number");
    }

    // Метод, обучающий животное новым командам
    private void learnCommands(Scanner scanner) {
        groupController.learnCommands(scanner, logger);
    }

    // Метод, выводящий на экран команды конкретного животного
    private void showCommands(Scanner scanner) {
        groupController.showCommands(scanner, logger);
    }

    // Метод, отображающий количество животных в списке
    private void printCount() {
        groupController.printCount();
    }

    private void removeAnimal(Scanner scanner) {
        groupController.removeAnimal(scanner, logger);
    }

    // Циклический метод. Вызывается из главного метода
    public void circleProgram(Scanner scanner) {
        logger.printLog("Program is started");
        MenuEnum menuEnum;
        while (true) {
            menuEnum = menuNavigation(scanner);
            switch (menuEnum) {
                case exit -> {
                    logger.printLog("Program is finished");
                    return;
                }
                case printAnimalList -> printAnimalList();
                case addAnimal -> addAnimal(scanner);
                case sortByBirthDate -> sortAnimals();
                case sortByNumber -> noSortAnimals();
                case learnCommands -> learnCommands(scanner);
                case show -> showCommands(scanner);
                case printCount -> printCount();
                case remove -> removeAnimal(scanner);
            }
        }
    }
}
