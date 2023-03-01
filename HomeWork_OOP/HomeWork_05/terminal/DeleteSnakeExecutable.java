package HomeWork_OOP.HomeWork_05.terminal;

import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.DeleteSnake();
    }
    
}
