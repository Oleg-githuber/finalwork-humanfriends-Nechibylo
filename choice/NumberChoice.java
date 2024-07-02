package choice;

import logger.AnimalLogger;
import model.Animal;

import java.util.List;
import java.util.Scanner;

public class NumberChoice {
    public int selectNumberOfAnimal(Scanner scanner, AnimalLogger logger, List<Animal> animalList) {
        int number = 0;
        while (number < 1 || number > animalList.size()) {
            System.out.println("Enter number of the animal");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if ((number < 1 || number > animalList.size()))
                    logger.printWarning("Number is wrong");
            } catch (NumberFormatException e) {
                logger.printWarning("Number is incorrect");
            }
        }
        return number;
    }
}
