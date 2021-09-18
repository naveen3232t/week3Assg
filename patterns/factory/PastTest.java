package patterns.factory;

public class PastTest {
    public static void main(String[] args) {
        PastaFactory factory = new PastaFactory();

        PastaStore store = new PastaStore(factory);

        Pasta pasta = store.getPasta("penne");

        System.out.println("You requested for: " + pasta.getName());

        System.out.println(pasta);
    }

}
