package HomeWork_OOP.HomeWork_05.terminal;

import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.DeleteLion();
    }
}
