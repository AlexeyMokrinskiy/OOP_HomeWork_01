package HomeWork_OOP.HomeWork_05.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import HomeWork_OOP.HomeWork_05.zoo.Zoo;

public class TerminalReader {

    public static TerminalReader terminalReader;
    private CommandParser commandParser;

    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void endless(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please, input the Animal:\nlion\nsnake\nwolf\nor stop to end the programm");
            String animalType = scanner.nextLine();
            if (animalType.equals("stop"))
                break;
            System.out.println("Please, input opertion:\nadd to create Animal\ndel to remove Animal");
            String operationType = scanner.nextLine();
            String inputList = animalType + operationType;
            List<String> choseCheck = Arrays.asList("lionadd", "liondel", "snakeadd", "snakedel",
                    "wolfadd", "wolfdel");
            if (choseCheck.contains(inputList)) {
                CommandExecutableFactory oper = new CommandExecutableFactory(zoo);
                oper.create(inputList).execute();
            } else
                System.out.println("input error");
        }
        scanner.close();
    }
}
