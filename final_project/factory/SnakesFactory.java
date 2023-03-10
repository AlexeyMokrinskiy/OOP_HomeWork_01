package final_project.factory;

import java.util.ArrayList;
import java.util.Random;
import final_project.animals.Snake;

public class SnakesFactory {
    public static ArrayList<Snake> createSnakes (int  snakeCount){
        ArrayList<Snake> snakesList = new ArrayList<>();
        for(int i = 0; i < snakeCount; i++){
            Random random = new Random();
            int maxWeight = new Snake("w", 0, 0, 0, 0).getmaxWeight();
            Snake snake = new Snake("w" + i, random.nextInt(2018, 2023) , random.nextInt(maxWeight/2, maxWeight), 4, random.nextInt(45, 65));
            snakesList.add(snake);
        }
        return snakesList;
    }

}
