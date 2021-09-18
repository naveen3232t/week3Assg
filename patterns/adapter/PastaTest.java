package patterns.adapter;

public class PastaTest {
    public static void main(String[] args) {
        Pasta pasta = new Pennepasta();

        System.out.println("This pasta provides ...");
        pasta.pronounce();
        pasta.cook();
        pasta.pair();

        Pasta spaghetti = new Spaghettipasta();

        System.out.println("This other pasta however ...");
        spaghetti.pronounce();
        spaghetti.cook();
        spaghetti.pair();

    }
}
