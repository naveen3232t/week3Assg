public class DoorDashOrderCancelCommand {
    DoorDashOrderMake DoorDashOrderMake;

    public DoorDashOrderCancelCommand(DoorDashOrderMake DoorDashOrderMake) {
        this.DoorDashOrderMake = DoorDashOrderMake;
    }

    public void execute() {
        DoorDashOrderMake.doordashcancel();
    }
}
