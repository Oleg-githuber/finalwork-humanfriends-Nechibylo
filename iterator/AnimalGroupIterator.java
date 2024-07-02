package iterator;

import model.Animal;

import java.util.Iterator;
import java.util.List;

// Итератор животных
public class AnimalGroupIterator implements Iterator<Animal> {
    private List<Animal> animalList;
    private int count;

    public AnimalGroupIterator(List<Animal> animalList) {
        this.animalList = animalList;
        this.count = 0;
    }

    public Animal getAnimal() {
        return animalList.get(count);
    }

    @Override
    public boolean hasNext() {
        return (count < animalList.size());
    }

    @Override
    public Animal next() {
        if (hasNext()) return animalList.get(count++);
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) animalList.remove(count);
    }
}
