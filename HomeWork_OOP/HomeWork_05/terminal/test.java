package HomeWork_OOP.HomeWork_05.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
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
            } else
                System.out.println("input error");
        }
        scanner.close();
    }
}
