package HomeWork_OOP.HomeWork_06.terminal.animalActionExecutable;

import HomeWork_OOP.HomeWork_06.terminal.Command;
import HomeWork_OOP.HomeWork_06.terminal.CommandExecutable;
import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteSnakeExecutable() {

    }

    public  DeleteSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteSnakeExecutable(zoo);
    }


    @Override
    public void execute() {
        this.zoo.takeOfSnake();
    }
}
