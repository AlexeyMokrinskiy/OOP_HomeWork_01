package HomeWork_OOP.HomeWork_04;

import java.util.ArrayList;

import HomeWork_OOP.HomeWork_04.animalUtils.AnimalUtils;
import HomeWork_OOP.HomeWork_04.animals.Lion;
import HomeWork_OOP.HomeWork_04.animals.Wolf;
import HomeWork_OOP.HomeWork_04.factory.LionsFactory;
import HomeWork_OOP.HomeWork_04.factory.WolfsFactory;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);
        for (Lion lion : lions) {
            System.out.println(lion);
        }
        System.out.println("_______________________");
        AnimalUtils.sortAnimalsAge(lions);
        for (Lion lion : lions) {
            System.out.println(lion);
        }

        System.out.println("__________wolfs_____________");

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(10);
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);
        }
        System.out.println("_______________________");
        AnimalUtils.sortAnimalsWeight(wolfs);
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);
        }
    }
}
