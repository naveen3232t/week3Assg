package patterns.factory;

public class PastaStore {
    PastaFactory factory;

    public PastaStore(PastaFactory factory) {
        this.factory = factory;
    }

    public Pasta getPasta(String type) {
        Pasta pasta;
        pasta = factory.createPasta(type);

        pasta.pronounce();
        pasta.pair();
        pasta.cook();

        return pasta;
    }

}
