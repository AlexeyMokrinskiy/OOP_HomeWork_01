package final_project.comparators;

import java.util.Comparator;
import final_project.animals.Animal;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getYearBirth() < o2.getYearBirth()){
            return 1;
        }
        else if(o1.getYearBirth() > o2.getYearBirth()){
            return -1;
        }
        return 0;
    }
}