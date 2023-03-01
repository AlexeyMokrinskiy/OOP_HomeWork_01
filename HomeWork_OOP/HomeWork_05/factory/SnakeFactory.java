package HomeWork_OOP.HomeWork_05.factory;

import java.util.ArrayList;
import java.util.Random;
import HomeWork_OOP.HomeWork_05.animals.Snake;

public class SnakeFactory {

    public static ArrayList<Snake> createSnakes (int snakeCount){
        ArrayList<Snake> snakeInCage = new ArrayList<>(snakeCount);
        for (int i = 0; i < snakeCount; i++) {
            Snake snake = new Snake(new Random().nextInt(30), new Random().nextInt(100), 10, new Random().nextInt(100));
            snakeInCage.add(snake);
        }
        return snakeInCage;
    }
}
