public class PastaBuilderOrderMake implements Command {


    PastaBuilder PastaBuilder;
    public PastaBuilderOrderMake(PastaBuilder PastaBuilder){
        this.PastaBuilder=PastaBuilder;

    }
    @Override
    public void excute() {
        PastaBuilder.on();
        PastaBuilder.setFlour(1);
        PastaBuilder.PresetPizaa(2);
        PastaBuilder.setShape(3);


    }
}
