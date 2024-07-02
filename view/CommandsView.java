package view;

import controller.AnimalController;
import logger.AnimalLogger;
import model.Animal;

import java.util.Scanner;

public class CommandsView {
    public void showCommands(Scanner scanner, AnimalLogger logger, Animal animal) {
        AnimalController animalController = new AnimalController();
        animalController.showCommands(animal);
    }
}
