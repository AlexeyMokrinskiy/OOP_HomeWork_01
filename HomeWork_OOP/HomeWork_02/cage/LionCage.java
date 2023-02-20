package HomeWork_OOP.HomeWork_02.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import HomeWork_OOP.HomeWork_02.animals.Animal;
import HomeWork_OOP.HomeWork_02.animals.Lion;

public class LionCage implements AnimalCage {

    private int clean;
    private ArrayList<Lion> lions;

    public LionCage() {
        lions = new ArrayList<>();
    }

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public void getAnimal() {
        int randomAnimal = (int) ((Math.random()) * lions.size());
        if (lions.size() == 0) {
            System.out.println("The cage is empty");
        } else {
            lions.get(randomAnimal);
            System.out.println(lions.toString());
        }
    }

    @Override
    public int addAnimal(Animal animal) {
        lions.add((Lion) animal);
        return lions.size();
    }

    @Override
    public int delyverFeed(int weightOfFood) {
        int animalPortion = weightOfFood / lions.size();
        for (Lion lion : lions) {
            if (lion.feed(weightOfFood)) {
                weightOfFood -= animalPortion;
            }
        }
        System.out.println("Remain food: " + weightOfFood);
        return weightOfFood;
    }

    @Override
    public boolean cleanCage() {
        LocalTime now = LocalTime.now();
        if (now.getHour() < 12) {
            return false;
        } else
            return true;
    }

    @Override
    public String toString() {
        return "LionCage(" + "Lions=" + lions + ", clean" + clean + ")";
    }

}
