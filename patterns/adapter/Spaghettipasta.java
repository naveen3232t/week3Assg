package patterns.adapter;

public class Spaghettipasta implements Pasta {

    @Override
    public void pronounce() {
        System.out.println("Pasta is pronounced: spah-GEH-tee");

    }

    @Override
    public void pair() {
        System.out.println("Pasta Pairings: Tomato or puttanesca sauces");

    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta for: 8 to 10 minutes");

    }

}
