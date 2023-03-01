package HomeWork_OOP.HomeWork_05;

import java.util.ArrayList;

import HomeWork_OOP.HomeWork_05.animals.Snake;
import HomeWork_OOP.HomeWork_05.animalUtils.AnimalUtils;
import HomeWork_OOP.HomeWork_05.animals.Lion;
import HomeWork_OOP.HomeWork_05.animals.Wolf;
import HomeWork_OOP.HomeWork_05.factory.LionsFactory;
import HomeWork_OOP.HomeWork_05.factory.SnakeFactory;
import HomeWork_OOP.HomeWork_05.factory.WolfsFactory;
import HomeWork_OOP.HomeWork_05.terminal.TerminalReader;
import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);
        for (Lion lion : lions) {
            System.out.println(lion);
        }
        // System.out.println("_______________________");
        // AnimalUtils.sortAnimalsAge(lions);
        // for (Lion lion : lions) {
        //     System.out.println(lion);
        // }

        // System.out.println("__________wolfs_____________");

        // ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(10);
        // for (Wolf wolf : wolfs) {
        //     System.out.println(wolf);
        // }
        // System.out.println("_______________________");
        // AnimalUtils.sortAnimalsWeight(wolfs);
        // for (Wolf wolf : wolfs) {
        //     System.out.println(wolf);
        // }

        // ArrayList<Snake> snakes = SnakeFactory.createSnakes(10);
        // for (Snake snake : snakes) {
        //     System.out.println(snake);
        // }
        // System.out.println("_______________________");
        // AnimalUtils.sortAnimalsWeight(wolfs);
        // for (Snake snake : snakes) {
        //     System.out.println(snake);
        // }

        TerminalReader terminal = new TerminalReader(null);
        Zoo zoo = new Zoo(null, null, null);
        terminal.endless(zoo);
        System.out.println();
    }
}
