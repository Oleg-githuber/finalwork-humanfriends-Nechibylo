package model.packAnimals;

import enumeration.Type;
import model.PackAnimal;

import java.time.LocalDate;
import java.util.Scanner;

public class Donkey extends PackAnimal {
    private int donkeyNumber;
    public Donkey(String name, LocalDate birthDate, int totalNumber, int packAnimalNumber, int donkeyNumber, Scanner scanner) {
        super(name, birthDate, totalNumber, packAnimalNumber, scanner);
        super.setType(Type.donkey);
        this.donkeyNumber = donkeyNumber;
    }

    public int getDonkeyNumber() {
        return donkeyNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tDonkey No %d\n\t\t%s",super.toString(), this.donkeyNumber, super.commandsToString());
    }
}
