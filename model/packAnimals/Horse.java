package model.packAnimals;

import enumeration.Type;
import model.PackAnimal;

import java.time.LocalDate;
import java.util.Scanner;

public class Horse extends PackAnimal {
    private int horseNumber;
    public Horse(String name, LocalDate birthDate, int totalNumber, int packAnimalNumber, int horseNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, packAnimalNumber, scanner);
        super.setType(Type.horse);
        this.horseNumber = horseNumber;
    }

    public int getHorseNumber() {
        return horseNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tHorse No %d\n\t\t%s",super.toString(), this.horseNumber, super.commandsToString());
    }
}
