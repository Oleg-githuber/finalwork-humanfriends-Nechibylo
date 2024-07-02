package model;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Pet extends Animal {
    private int petNumber;
    public Pet(String name, LocalDate birthDate, int totalNumber, int petNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, scanner);
        this.petNumber = petNumber;
    }

    @Override
    public String toString() {
        return String.format("%s:\n\t\tPet №%d", super.toString(), this.petNumber);
    }
}
