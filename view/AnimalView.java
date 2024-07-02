package view;

import iterator.AnimalGroupIterator;
import model.Animal;

import java.util.List;

public class AnimalView {
    public void printCommand(Animal animal) {
        System.out.println(animal.commandsToString());
    }

    public void printAnimalInList(List<Animal> animalList) {
        if (!animalList.isEmpty()) {
            AnimalGroupIterator iterator = new AnimalGroupIterator(animalList);
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else System.out.println("Animal list is empty");
    }
}
