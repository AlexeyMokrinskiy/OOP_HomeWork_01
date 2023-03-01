package HomeWork_OOP.HomeWork_05.comparators;

import java.util.Comparator;
import HomeWork_OOP.HomeWork_05.animals.Animal;

public class AnimalWeightComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}

