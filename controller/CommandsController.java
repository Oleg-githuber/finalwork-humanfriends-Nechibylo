package controller;

import logger.AnimalLogger;
import model.Animal;

import java.util.Scanner;

public class CommandsController {
    public void learnCommands(Scanner scanner, AnimalLogger logger, Animal animal) {
        AnimalController animalController = new AnimalController();
        animalController.addCommands(scanner, animal, logger);
    }
}
