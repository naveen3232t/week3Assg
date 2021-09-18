package patterns.factory;

abstract public class Pasta {
    String name;

    String pronunciation;

    String pairing;

    String cooking;

    public String getName() {
        return this.name;
    }

    public void pronounce() {
        System.out.println("pronouncing " + name);

    }

    public void pair() {
        System.out.println("pairing " + name);
    }

    public void cook() {
        System.out.println("cooking " + name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(pronunciation + "\n");
        display.append(pairing + "\n");
        display.append(cooking + "\n");
        return display.toString();
    }
}
