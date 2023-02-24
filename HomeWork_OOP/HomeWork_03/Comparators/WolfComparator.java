package HomeWork_OOP.HomeWork_03.Comparators;

import java.util.Comparator;
import HomeWork_OOP.HomeWork_03.animals.Wolf;

public class WolfComparator implements Comparator<Wolf> {

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
   
}