package patterns.adapter;

public class Pennepasta implements Pasta {

    @Override
    public void pronounce() {
        System.out.println("Pasta is pronounced: PEH-neh");

    }

    @Override
    public void pair() {
        System.out.println("Pasta Pairings: Chunky tomato, meat, vegetable, or cream");

    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta for: 9 to 13 minutes");

    }

}
