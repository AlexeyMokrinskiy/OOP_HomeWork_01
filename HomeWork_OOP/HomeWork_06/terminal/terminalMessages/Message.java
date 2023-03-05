package HomeWork_OOP.HomeWork_06.terminal.terminalMessages;

public abstract class Message {
    protected String message;

    public void consoleMessage() {
        System.out.println(this.message);
    }

}
