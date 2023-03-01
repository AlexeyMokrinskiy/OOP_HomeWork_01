package HomeWork_OOP.HomeWork_05.terminal;

import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(String inputList) {
        if (inputList.equals("lionadd")) {
            return new CreateLionExecutable(zoo);
        }
        if (inputList.equals("liondel")) {
            return new DeleteLionExecutable(zoo);
        }
        if (inputList.equals("snakeadd")) {
            return new CreateSnakeExecutable(zoo);
        }
        if (inputList.equals("snakedel")) {
            return new DeleteSnakeExecutable(zoo);
        }
        if (inputList.equals("wolfadd")) {
            return new CreateWolfExecutable(zoo);
        }
        if (inputList.equals("wolfdel")) {
            return new DeleteWolfExecutable(zoo);
        }
        return null;

    }
}
// "lionadd", "liondel", "snakeadd", "snakedel",
// "wolfadd", "wolfdel"