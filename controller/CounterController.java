package controller;

// Контроллер счётчиков животных
public class CounterController {
    private int animalCount;
    private int packAnimalCount;
    private int petCount;
    private int dogCount;
    private int catCount;
    private int hamsterCount;
    private int horseCount;
    private int camelCount;
    private int donkeyCount;

    public CounterController() {
        this.animalCount = 0;
        this.packAnimalCount = 0;
        this.petCount = 0;
        this.dogCount = 0;
        this.catCount = 0;
        this.hamsterCount = 0;
        this.horseCount = 0;
        this.camelCount = 0;
        this.donkeyCount = 0;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void incrementAnimalCount() {
        this.animalCount ++;
    }

    public int getPackAnimalCount() {
        return packAnimalCount;
    }

    public void incrementPackAnimalCount() {
        this.packAnimalCount++;
    }

    public int getPetCount() {
        return petCount;
    }

    public void incrementPetCount() {
        this.petCount++;
    }

    public int getDogCount() {
        return dogCount;
    }

    public void incrementDogCount() {
        this.dogCount++;
    }

    public int getCatCount() {
        return catCount;
    }

    public void incrementCatCount() {
        this.catCount++;
    }

    public int getHamsterCount() {
        return hamsterCount;
    }

    public void incrementHamsterCount() {
        this.hamsterCount++;
    }

    public int getHorseCount() {
        return horseCount;
    }

    public void incrementHorseCount() {
        this.horseCount++;
    }

    public int getCamelCount() {
        return camelCount;
    }

    public void incrementCamelCount() {
        this.camelCount++;
    }

    public int getDonkeyCount() {
        return donkeyCount;
    }

    public void incrementDonkeyCount() {
        this.donkeyCount++;
    }
}
