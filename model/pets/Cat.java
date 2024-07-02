package model.pets;

import enumeration.Type;
import model.Pet;

import java.time.LocalDate;
import java.util.Scanner;

public class Cat extends Pet {
    private int catNumber;
    public Cat(String name, LocalDate birthDate, int totalNumber, int petNumber, int catNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, petNumber, scanner);
        super.setType(Type.cat);
        this.catNumber = catNumber;
    }

    public int getCatNumber() {
        return catNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tCat No %d\n\t\t%s",super.toString(), this.catNumber, super.commandsToString());
    }
}
