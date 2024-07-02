package factory;

import calendar.Calendar;
import logger.AnimalLogger;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthdateFactory {
    private int enterBirthYear(Scanner scanner, AnimalLogger logger) {
        int birthYear;
        while (true) {
            System.out.println("Enter birth year of the animal");
            try {
                birthYear = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                logger.printWarning("You entered incorrect year");
                continue;
            }
            if(birthYear < 2000 || birthYear > LocalDate.now().getYear()) {
                logger.printWarning("You entered wrong year");
                continue;
            }
            return birthYear;
        }
    }

    // Метод ввода месяца рождения животного
    private int enterBirthMonth(Scanner scanner, int birthYear, AnimalLogger logger) {
        int birthMonth;
        while (true) {
            System.out.println("Enter birth month of the animal");
            try {
                birthMonth = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                logger.printWarning("You entered incorrect month");
                continue;
            }
            if(birthMonth < 1 || birthMonth > 12 || ((birthYear == LocalDate.now().getYear()) && (birthMonth > LocalDate.now().getMonthValue()))) {
                logger.printWarning("You entered wrong month");
                continue;
            }
            return birthMonth;
        }
    }

    // Метод ввода для месяца животного
    private int enterBirthDay(Scanner scanner, int birthYear, int birthMonth, AnimalLogger logger) {
        int birthDay;
        while (true) {
            System.out.println("Enter birth day of month of the animal");
            try {
                birthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                logger.printWarning("you entered incorrect day");
                continue;
            }
            if(
                    birthDay < 1 || birthDay > new Calendar().valueOfDaysInMonth(birthYear, birthMonth) ||
                            birthMonth > new Calendar().valueOfDaysInMonth(birthYear, birthMonth) ||
                            ((birthYear == LocalDate.now().getYear()) &&
                                    (birthMonth > LocalDate.now().getMonthValue()) &&
                                    (birthDay > LocalDate.now().getDayOfMonth()))
            ) {
                logger.printWarning("You entered wrong day");
                continue;
            }
            return birthMonth;
        }
    }

    // Метод ввода даты рождения животного
    public LocalDate enterBirthDate(Scanner scanner, AnimalLogger logger) {
        int birthYear = enterBirthYear(scanner, logger);
        int birthMonth = enterBirthMonth(scanner, birthYear, logger);
        int birthDay = enterBirthDay(scanner, birthYear, birthMonth, logger);
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return birthDate;
    }
}
