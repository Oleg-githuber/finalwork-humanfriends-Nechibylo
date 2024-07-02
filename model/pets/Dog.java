package model.pets;

import enumeration.Type;
import model.Pet;

import java.time.LocalDate;
import java.util.Scanner;

public class Dog extends Pet {
    private int dogNumber;
    public Dog(String name, LocalDate birthDate, int totalNumber, int petNumber, int dogNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, petNumber, scanner);
        super.setType(Type.dog);
        this.dogNumber = dogNumber;
    }

    public int getDogNumber() {
        return dogNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tDog No %d\n\t\t%s",super.toString(), this.dogNumber, super.commandsToString());
    }
}
