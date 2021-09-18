package patterns.builder;

public class PennePastaBuilder extends PastaBuilder {
    public PennePastaBuilder() {
        this.name = "Penne";
    }

    @Override
    public PastaBuilder pronounce() {
        this.pronunciation = "PEH-neh";
        return this;
    }

    @Override
    public PastaBuilder pair() {
        this.pairing = "Chunky tomato, meat, vegetable, or cream";
        return this;
    }

    @Override
    public PastaBuilder cook() {
        this.cooking = "9 to 13 minutes";
        return this;
    }
}
