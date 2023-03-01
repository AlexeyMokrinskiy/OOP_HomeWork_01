package HomeWork_OOP.HomeWork_05.terminal;

import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{
    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.CreateLion();
    }
}
