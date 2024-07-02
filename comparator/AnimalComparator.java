package comparator;

import model.Animal;

import java.util.Comparator;

// Компаратор для сортировки животных по дате рождения
public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        int result = o1.compareTo(o2);
        if (result == 0) result = o1.toString().compareTo(o2.toString());
        return result;
    }
}
