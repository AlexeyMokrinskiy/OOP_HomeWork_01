package HomeWork_OOP.HomeWork_06.factory;

import java.util.ArrayList;
import java.util.Random;
import HomeWork_OOP.HomeWork_06.animals.Wolf;

public class WolfsFactory {
    public static ArrayList<Wolf> createWolves (int wolfCount){
        ArrayList<Wolf> wolvesList = new ArrayList<>();
        for(int i = 0; i < wolfCount; i++){
            Random random = new Random();
            int maxWeight = new Wolf("w", 0, 0, 0, 0).getMaxWeight();
            Wolf wolf = new Wolf("w" + i, random.nextInt(2018, 2023) , random.nextInt(maxWeight/2, maxWeight), 4, random.nextInt(45, 65));
            wolvesList.add(wolf);
        }
        return wolvesList;
    }

}