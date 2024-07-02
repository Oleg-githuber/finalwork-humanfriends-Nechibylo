package model;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class PackAnimal extends Animal {
    private int packAnimalNumber;
    public PackAnimal(String name, LocalDate birthDate, int totalNumber, int packAnimalNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, scanner);
        this.packAnimalNumber = packAnimalNumber;
    }

    public int getPackAnimalNumber() {
        return packAnimalNumber;
    }

    @Override
    public String toString() {
        return String.format("%s:\n\t\tPack animal №%d", super.toString(), this.packAnimalNumber);
    }
}
