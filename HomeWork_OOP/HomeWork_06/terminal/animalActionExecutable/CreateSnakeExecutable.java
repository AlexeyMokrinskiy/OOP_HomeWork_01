package HomeWork_OOP.HomeWork_06.terminal.animalActionExecutable;

import java.util.ArrayList;
import HomeWork_OOP.HomeWork_06.animals.Snake;
import HomeWork_OOP.HomeWork_06.terminal.Command;
import HomeWork_OOP.HomeWork_06.terminal.CommandExecutable;
import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable {

    private Zoo zoo;
    private Snake snake;

    public CreateSnakeExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.snake = new Snake(input.get(0), Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 0,
                Integer.parseInt(input.get(3)));
    }

    public CreateSnakeExecutable() {

    }


    public CreateSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new CreateSnakeExecutable(zoo, command);
    }


    @Override
    public void execute() {
        this.zoo.addSnake(snake);
    }
}
