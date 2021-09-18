package patterns.builder;

public class Pasta {
    String name;

    String pronunciation;

    String pairing;

    String cooking;

    void init(String name, String pronunciation, String pairing, String cooking) {
        this.name = name;
        this.pronunciation = pronunciation;
        this.pairing = pairing;
        this.cooking = cooking;
    }

    void pronounce() {
        System.out.println("I am pronounces: " + this.pronunciation);
    }

    void pair() {
        System.out.println("I have these pairings: " + this.pairing);
    }

    void cook() {
        System.out.println("I cook for: " + this.cooking);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        return display.toString();
    }
}
