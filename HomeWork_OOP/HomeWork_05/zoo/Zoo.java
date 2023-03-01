package HomeWork_OOP.HomeWork_05.zoo;

import HomeWork_OOP.HomeWork_05.animals.Lion;
import HomeWork_OOP.HomeWork_05.animals.Snake;
import HomeWork_OOP.HomeWork_05.animals.Wolf;
import HomeWork_OOP.HomeWork_05.cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Lion> lionCage, AnimalCage<Wolf> wolfCage, AnimalCage<Snake> snakeCage) {
        this.lionCage = lionCage;
        this.wolfCage = wolfCage;
        this.snakeCage = snakeCage;
    }

    public int CreateLion() { 
        return this.lionCage.addAnimal(null);
	}

    public int CreateSnake() { 
        return this.snakeCage.addAnimal(null);
	}

    public int CreateWolf() { 
        return this.wolfCage.addAnimal(null);
	}

    public Lion DeleteLion(){
        return this.lionCage.getAnimal();
    }

    public Snake DeleteSnake(){
        return this.snakeCage.getAnimal();
    }

    public Wolf DeleteWolf(){
        return this.wolfCage.getAnimal();
    }

    public AnimalCage<Wolf> getwolfCage() {
        return wolfCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Snake> getSnakeCage() {
        return snakeCage;
    }

    public void setSnakeCage(AnimalCage<Snake> snakeCage) {
        this.snakeCage = snakeCage;
    }

	
}