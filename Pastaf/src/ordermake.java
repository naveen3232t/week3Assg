public class ordermake {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressbutton(){
        command.excute();
    }
}
