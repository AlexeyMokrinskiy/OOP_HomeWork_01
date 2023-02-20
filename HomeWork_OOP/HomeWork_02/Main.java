package HomeWork_OOP.HomeWork_02;

import java.util.ArrayList;

import HomeWork_OOP.HomeWork_02.animals.Lion;
import HomeWork_OOP.HomeWork_02.animals.Wolf;
import HomeWork_OOP.HomeWork_02.cage.LionCage;
import HomeWork_OOP.HomeWork_02.cage.WolfCage;
import HomeWork_OOP.HomeWork_02.factory.LionsFactory;
import HomeWork_OOP.HomeWork_02.factory.WolfsFactory;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(10);
        WolfCage wolfInCage = new WolfCage(wolfs);
        System.out.println(wolfInCage);

    }
}
