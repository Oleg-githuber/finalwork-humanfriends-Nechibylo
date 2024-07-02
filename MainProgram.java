import controller.AnimalGroupController;
import controller.MenuController;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuController controller = new MenuController();
        controller.circleProgram(scanner);
        scanner.close();
    }
}
