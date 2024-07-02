package model.pets;

import enumeration.Type;
import model.Pet;

import java.time.LocalDate;
import java.util.Scanner;

public class Hamster extends Pet {
    private int hamsterNumber;
    public Hamster(String name, LocalDate birthDate, int totalNumber, int petNumber, int hamsterNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, petNumber, scanner);
        super.setType(Type.hamster);
        this.hamsterNumber = hamsterNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tHamster No %d\n\t\t%s",super.toString(), this.hamsterNumber, super.commandsToString());
    }
}
