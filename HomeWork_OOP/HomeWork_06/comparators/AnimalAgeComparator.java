package HomeWork_OOP.HomeWork_06.comparators;

import java.util.Comparator;

import HomeWork_OOP.HomeWork_06.animals.Animal;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
