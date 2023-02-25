package HomeWork_OOP.HomeWork_04.factory;

import java.util.ArrayList;
import java.util.Random;
import HomeWork_OOP.HomeWork_04.animals.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(new Random().nextInt(30), new Random().nextInt(100), 10, new Random().nextInt(100));
            lionInCage.add(lion);
        }
        return lionInCage;
    }
}
