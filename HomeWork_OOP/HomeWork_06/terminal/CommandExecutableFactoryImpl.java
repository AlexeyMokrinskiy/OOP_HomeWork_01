package HomeWork_OOP.HomeWork_06.terminal;

import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {
        CommandTypes codeEnum = input.getCommandEnum();
        CommandExecutable exec = codeEnum.getMethod();
        return exec.getZoo(zoo, input);
    }
}