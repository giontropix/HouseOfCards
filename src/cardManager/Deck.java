package cardManager;

import java.util.Stack;

public interface Deck {

    void deckFiller(Stack<Card> deck);

    void shuffleDeck();

    Stack<Card> extractCard();
}