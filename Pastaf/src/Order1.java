public class Order1 {
    public static void main(String[] args) {
        ordermake order = new ordermake();
        PastaBuilder PastaBuilder = new PastaBuilder();
        DoorDashOrderMake DoorDashOrderMake = new DoorDashOrderMake();


        order.setCommand(new PastaBuilderOrderMake(PastaBuilder));
        order.pressbutton();
        order.setCommand(new DoorDashOrderMakeeCommand(DoorDashOrderMake));
        order.pressbutton();
        order.setCommand(new PastaBuilderOrderCancel(PastaBuilder));
        order.pressbutton();


    }
}
