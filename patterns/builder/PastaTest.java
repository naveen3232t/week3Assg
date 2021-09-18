package patterns.builder;

public class PastaTest {
    public static void main(String[] args) {
        PastaBuilder builder = new PennePastaBuilder();

        Pasta pasta = builder.pronounce().cook().pair().build();

        System.out.println("This pasta ...");
        pasta.pronounce();
        pasta.cook();
        pasta.pair();
    }
}
