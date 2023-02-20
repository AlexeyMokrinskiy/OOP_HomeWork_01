package HomeWork_OOP.HomeWork_02.factory;

import java.util.ArrayList;
import Seminar_02.Task_01.animals.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(10, 10, 10, 10);
            lionInCage.add(lion);
        }
        return lionInCage;
    }
}
