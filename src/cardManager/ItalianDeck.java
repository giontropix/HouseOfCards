package cardManager;

import java.util.Collections;
import java.util.Stack;

public class ItalianDeck implements Deck {
    Stack<Card> italianDeck = new Stack<>();
    Stack<Card> extractedFromItalianDeck = new Stack<>();

    public ItalianDeck(){
        deckFiller(this.italianDeck);
    }

    @Override
    public void deckFiller(Stack<Card> deck) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 11; j++) {
                switch (i){
                    case 0: deck.push(new Card(j, "Spade", true, true));
                    break;
                    case 2: deck.push(new Card(j, "Mazze", true, true));
                    break;
                    case 3: deck.push(new Card(j, "Oro", true, true));
                    break;
                    case 4: deck.push(new Card(j, "Coppe", true, true));
                    break;
                }
            }
        }
    }

    @Override
    public void shuffleDeck() {
        Collections.shuffle(italianDeck);
    }

    @Override
    public Stack<Card> extractCard() {
        this.extractedFromItalianDeck.push(this.italianDeck.pop());
        return this.extractedFromItalianDeck;
    }
}
