package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
        drawCard();

    }

    public Card drawCard() {
        return cards.removeFirst();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit value : Suit.values()) {
                cards.add(new Card(i, value));
            }
        }
    }
}
