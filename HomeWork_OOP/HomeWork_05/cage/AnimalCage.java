package HomeWork_OOP.HomeWork_05.cage;

import java.util.ArrayList;
import java.util.Collections;
import HomeWork_OOP.HomeWork_05.animals.Animal;
import HomeWork_OOP.HomeWork_05.comparators.AnimalAgeComparator;
import HomeWork_OOP.HomeWork_05.comparators.AnimalWeightComparator;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    T getAnimal();
    

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }

    default void sortByWeight (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalWeightComparator());
    }
}
