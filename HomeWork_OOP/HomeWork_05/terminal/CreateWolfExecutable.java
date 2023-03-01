package HomeWork_OOP.HomeWork_05.terminal;

import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable{
    private Zoo zoo;

    public CreateWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.CreateWolf();
    }
    
}
