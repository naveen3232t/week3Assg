public class PastaBuilderOrderCancel implements Command{

    PastaBuilder PastaBuilder;
    public PastaBuilderOrderCancel(PastaBuilder PastaBuilder){
        this.PastaBuilder=PastaBuilder;
    }


    @Override
    public void excute() {
        PastaBuilder.off();
        PastaBuilder.CancelOrder(99);
    }
}
