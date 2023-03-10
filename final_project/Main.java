package final_project;

import java.util.ArrayList;
import final_project.animals.Lion;
import final_project.animals.Snake;
import final_project.animals.Wolf;
import final_project.cage.LionCage;
import final_project.cage.SnakeCage;
import final_project.cage.WolfCage;
import final_project.factory.LionsFactory;
import final_project.factory.SnakesFactory;
import final_project.factory.WolfsFactory;
import final_project.terminal.TerminalReader;
import final_project.terminal.ZooCommandParser;
import final_project.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        ArrayList<Wolf> wolves = WolfsFactory.createWolves(5);
        WolfCage cageWolves = new WolfCage();
        cageWolves.setWolves(wolves);

        ArrayList<Snake> snakes = SnakesFactory.createSnakes(10);
        SnakeCage cageSnakes = new SnakeCage(snakes, 0, 0);
        cageSnakes.setSnakes(snakes);

        ArrayList<Lion> lions = LionsFactory.createLions(25);
        LionCage cageLions = new LionCage();
        cageLions.setLions(lions);

        Zoo zoo = new Zoo(cageWolves, cageLions, cageSnakes);
        TerminalReader term = TerminalReader.newTerminalReader(new ZooCommandParser());
        term.setZoo(zoo);
        term.endless();
        System.out.println();
    }
}