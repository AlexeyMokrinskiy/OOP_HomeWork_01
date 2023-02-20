package HomeWork_OOP.HomeWork_02.factory;

import java.util.ArrayList;
import HomeWork_OOP.HomeWork_02.animals.Wolf;

public class WolfsFactory {

    public static ArrayList<Wolf> createWolfs (int wolfCount){
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            Wolf wolf = new Wolf(10, 10, 10, 10);
            wolfInCage.add(wolf);
        }
        return wolfInCage;
    }
}
