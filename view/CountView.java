package view;

import controller.CounterController;

public class CountView {
    public void printCount(CounterController counterController) {
        System.out.printf("Total value of the animals: %d\n", counterController.getAnimalCount());

        System.out.printf("Pets: %d\n", counterController.getPetCount());

        System.out.printf("\tDogs: %d\n", counterController.getDogCount());
        System.out.printf("\tCats: %d\n", counterController.getCatCount());
        System.out.printf("\tHamsters: %d\n", counterController.getHamsterCount());

        System.out.printf("Pack animals: %d\n", counterController.getPackAnimalCount());

        System.out.printf("\tHorses: %d\n", counterController.getHorseCount());
        System.out.printf("\tDonkeys: %d\n", counterController.getDonkeyCount());
        System.out.printf("\tCamels: %d\n", counterController.getCamelCount());
    }
}
