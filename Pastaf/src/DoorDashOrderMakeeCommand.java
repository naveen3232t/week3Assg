public class DoorDashOrderMakeeCommand implements Command {

    DoorDashOrderMake DoorDashOrderMake;
    public DoorDashOrderMakeeCommand(DoorDashOrderMake DoorDashOrderMake){
        this.DoorDashOrderMake=DoorDashOrderMake;
    }
    @Override
    public void excute() {
        DoorDashOrderMake.doordashmake();
    }
}
