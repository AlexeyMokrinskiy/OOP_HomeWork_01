package final_project.animalUtils;

import java.util.Collections;
import java.util.List;

import final_project.animals.Animal;
import final_project.comparators.AnimalAgeComparator;
import final_project.comparators.AnimalWeightComparator;


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
