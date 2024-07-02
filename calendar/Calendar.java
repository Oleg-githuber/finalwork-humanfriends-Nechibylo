package calendar;

// Класс, проверяющий коректность ввода даты
public class Calendar {

    // Метод, вычисляющий количество дней в месяце
    public int valueOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                return (isYearLeap(year)) ? 29 : 28;
            case 4, 6, 9, 11:
            default: return 30;
        }
    }

    // Метод, вычисляющий високосный год
    private boolean isYearLeap(int year) {
        if(year % 4 != 0) return false;
        else if(year % 100 == 0) return false;
        return true;
    }
}
