package controller;

import calendar.Calendar;
import factory.BirthdateFactory;
import logger.AnimalLogger;
import model.Animal;
import view.AnimalView;

import java.time.LocalDate;
import java.util.Scanner;

// Класс для работы с выбранным животным
public class AnimalController {

    // Метод ввода имени животного
    public String enterName(Scanner scanner) {
        System.out.println("Enter name of the animal");
        String name = scanner.nextLine();
        return name;
    }

    // Метод ввода даты рождения животного
    public LocalDate enterBirthDate(Scanner scanner, AnimalLogger logger) {
        return new BirthdateFactory().enterBirthDate(scanner, logger);
    }

    // Метод, добавляющий команды, выполняемые животным
    public void addCommands(Scanner scanner, Animal animal, AnimalLogger logger) {
        int value = 0;
        if (!animal.getCommandList().isEmpty()) value = animal.getCommandList().size();
        animal.addCommands(scanner);
        if (!animal.getCommandList().isEmpty() && animal.getCommandList().size() != value)
            logger.printLog("The animal has learn new commands");
    }

    // Метод, выводящий на экран команды, выполняемые выбранным животным
    public void showCommands(Animal animal) {
        new AnimalView().printCommand(animal);
    }

}
