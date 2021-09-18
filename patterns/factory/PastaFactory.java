package patterns.factory;

public class PastaFactory {
    public Pasta createPasta(String type) {
        Pasta pasta = null;
        switch (type) {
            case "penne":
                pasta = new PennePasta();
                break;
            default:
                break;
        }
        return pasta;
    }
}
