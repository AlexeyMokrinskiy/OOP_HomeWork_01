package final_project.cage;

import java.util.ArrayList;
import java.util.Collections;
import final_project.animals.Animal;
import final_project.comparators.AnimalAgeComparator;


public interface AnimalCage<T extends Animal> {

    int addAnimal(T t);

    void giveFood(int foodWeight);

    void cleanCage(int garbageWeight);

    T takeOffAnimal();

    int countAnimals();

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AnimalAgeComparator());
    }



}
