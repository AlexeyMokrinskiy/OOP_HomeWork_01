package HomeWork_OOP.HomeWork_05.animalUtils;

import java.util.Collections;
import java.util.List;
import HomeWork_OOP.HomeWork_05.animals.Animal;
import HomeWork_OOP.HomeWork_05.comparators.AnimalAgeComparator;
import HomeWork_OOP.HomeWork_05.comparators.AnimalWeightComparator;

public class AnimalUtils {
    public static <T extends Animal> List<T> sortAnimalsAge(List<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
        return animalList;
    }

    public static <T extends Animal> List<T> sortAnimalsWeight(List<T> animalList) {
        Collections.sort(animalList, new AnimalWeightComparator());
        return animalList;
    }
}
