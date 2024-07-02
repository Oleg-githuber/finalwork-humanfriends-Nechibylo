package model;

import enumeration.Type;
import iterator.CommandIterator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private LocalDate birthDate;
    private List<String> commandList;
    private Type type;
    private int totalNumber;

    public Animal(String name, LocalDate birthDate, int totalNumber, Scanner scanner) {
        this.name = name;
        this.birthDate = birthDate;
        this.totalNumber = totalNumber;
        commandList = new ArrayList<>();
        addCommands(scanner);
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public List<String> getCommandList() {
        return commandList;
    }

    private void addCommand(String command) {
        commandList.add(command);
    }

    public void addCommands(Scanner scanner) {

        String command = null;
        while (!"q".equals(command)) {
            System.out.println("Enter command or \"q\" to finish: ");
            command = scanner.nextLine();
            if ("q".equals(command) || command.isEmpty()) {
                continue;
            }
            addCommand(command);
        }
    }

    public String commandsToString() {
        if (!commandList.isEmpty()) {
            String result = "Command list:\n\t\t";
            CommandIterator iterator = new CommandIterator(commandList);
            while (iterator.hasNext()) {
                result += String.format("\"%s\"", iterator.next());
                if (iterator.hasNext()) {
                    result += ", ";
                }
            }
//            for (String command : commandList) {
//
//            }
            return result;
        } else {
            return "Command list is empty";
        }
    }

    @Override
    public int compareTo(Animal o) {
        if (this.birthDate.getYear() > o.getBirthDate().getYear()) return 1;
        else if (this.birthDate.getYear() < o.getBirthDate().getYear()) return -1;
        else {
            if (this.birthDate.getMonthValue() > o.getBirthDate().getMonthValue()) return 1;
            else if (this.birthDate.getMonthValue() < o.getBirthDate().getMonthValue()) return -1;
            else {
                if (this.birthDate.getDayOfMonth() > o.getBirthDate().getDayOfMonth()) return 1;
                else if (this.birthDate.getDayOfMonth() < o.getBirthDate().getDayOfMonth()) return -1;
                else return 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("No %d\t%s\n\t\tBirthDate: %s", this.totalNumber, this.name, birthDate.toString());
    }
}
