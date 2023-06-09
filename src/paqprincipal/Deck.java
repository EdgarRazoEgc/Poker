package paqprincipal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            String color = "";
            if (palo.equals("Tréboles") || palo.equals("Picas")) {
                color = colores[0];
            } else {
                color = colores[1];
            }

            for (String valor : valores) {
                Card card = new Card(palo, color, valor);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.get(0);
            cards.remove(0);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            int index = (int) (Math.random() * cards.size());
            Card card = cards.get(index);
            cards.remove(index);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.get(i);
                System.out.println(card.toString());
            }
            cards.subList(0, 5).clear();
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }
}

