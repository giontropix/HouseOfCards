package cardManager;

import java.util.ArrayList;

public interface Deck {

    void deckFiller(ArrayList<Card> deck);

    void shuffleDeck();

    ArrayList<Card> extractCard();
}