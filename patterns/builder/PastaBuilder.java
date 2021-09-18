package patterns.builder;

public abstract class PastaBuilder {
    Pasta pasta;

    String name;

    String pronunciation;

    String pairing;

    String cooking;

    public abstract PastaBuilder pronounce();

    public abstract PastaBuilder pair();

    public abstract PastaBuilder cook();

    public Pasta build() {
        Pasta pasta = new Pasta();
        pasta.init(name, pronunciation, pairing, cooking);
        return pasta;
    }
}
