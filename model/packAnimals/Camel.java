package model.packAnimals;

import enumeration.Type;
import model.PackAnimal;

import java.time.LocalDate;
import java.util.Scanner;

public class Camel extends PackAnimal {
    private int camelNumber;
    public Camel(String name, LocalDate birthDate, int totalNumber, int packAnimalNumber, int camelNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, packAnimalNumber, scanner);
        super.setType(Type.camel);
        this.camelNumber = camelNumber;
    }

    public int getCamelNumber() {
        return camelNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tCamel No %d\n\t\t%s",super.toString(), this.camelNumber, super.commandsToString());
    }
}
