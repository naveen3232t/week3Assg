package patterns.adapter;

public class PastaAdapter implements Pasta {
    Pasta pasta;

    public PastaAdapter(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public void pronounce() {
        pasta.pronounce();
    }

    @Override
    public void pair() {
        pasta.pair();

    }

    @Override
    public void cook() {
        for (int i = 0; i < 5; i++) {
            pasta.cook();
        }
    }

}
