package final_project.terminal;

public class Check {

    public static boolean isCheck(String input) {
        String[] inputList = input.split("\\s");
        if (inputList.length != 2 && inputList.length != 6) {
            return false;
        } else if (!inputList[0].equals("wolf") && !inputList[0].equals("lion") && !inputList[0].equals("snake")){
            return false;}
        else if (!inputList[1].equals("del") && !inputList[1].equals("add")) {
            return false;
        }
        else if (inputList.length == 6 && !(inputList[3].matches("\\d+") &&
                inputList[4].matches("\\d+") &&
                inputList[5].matches("\\d+"))){
            return false;
        }
        else if(inputList.length == 2 && inputList[1].equals("add")){
            return false;
        }
        else {
            return true;
        }
    }
}