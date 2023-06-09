package paqprincipal;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("--- Sacando la primera carta ---");
        deck.head();

        System.out.println("--- Sacando una carta al azar ---");
        deck.pick();

        System.out.println("--- Repartiendo una mano ---");
        deck.hand();
    }
}
