package HomeWork_OOP.HomeWork_03.factory;

import java.util.ArrayList;
import java.util.Random;
import HomeWork_OOP.HomeWork_03.animals.Wolf;

public class WolfsFactory {

    public static ArrayList<Wolf> createWolfs (int wolfCount){
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            Wolf wolf = new Wolf(new Random().nextInt(30), new Random().nextInt(100), 10, new Random().nextInt(100));
            wolfInCage.add(wolf);
        }
        return wolfInCage;
    }
}
