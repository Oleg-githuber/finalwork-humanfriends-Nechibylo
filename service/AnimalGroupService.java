package service;

import comparator.AnimalComparator;
import model.AnimalGroup;
import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalGroupService {
    private AnimalGroup animalGroup;

    public AnimalGroupService(AnimalGroup animalGroup) {
        this.animalGroup = animalGroup;
    }

    public AnimalGroup getAnimalGroup() {
        return animalGroup;
    }

    public List<Animal> sortAnimalsByNumber() {
        List<Animal> sortingList = new ArrayList<>(animalGroup.getAnimalList());
        //Collections.sort(sortingList);
        return sortingList;
    }

    public List<Animal> sortAnimalsByBirthDate() {
        List<Animal> sortingList = new ArrayList<>(animalGroup.getAnimalList());
        sortingList.sort(new AnimalComparator());
        return sortingList;
    }
}
