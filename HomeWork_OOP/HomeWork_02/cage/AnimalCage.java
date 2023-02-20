package HomeWork_OOP.HomeWork_02.cage;

import HomeWork_OOP.HomeWork_02.animals.Animal;

public interface AnimalCage {

    int addAnimal(Animal animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    void getAnimal();
}
