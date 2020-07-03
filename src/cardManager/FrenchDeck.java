package cardManager;

import java.util.Collections;
import java.util.Stack;

public class FrenchDeck implements Deck {
    Stack<Card> frenchDeck = new Stack<>();
    Stack<Card> extractedFromFrenchDeck = new Stack<>();

    public FrenchDeck(){
        deckFiller(this.frenchDeck);
    }

    public Stack<Card> getExtractedFromFrenchDeck() {
        return extractedFromFrenchDeck;
    }

    public Stack<Card> getFrenchDeck() {
        return frenchDeck;
    }

    @Override
    public void deckFiller(Stack<Card> deck) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                switch (i){
                    case 0: deck.push(new Card(j, "Cuori", true, true));
                        break;
                    case 2: deck.push(new Card(j, "Picche", true, true));
                        break;
                    case 3: deck.push(new Card(j, "Quadri", true, true));
                        break;
                    case 4: deck.push(new Card(j, "Fiori", true, true));
                        break;
                }
            }
        }
    }

    @Override
    public void shuffleDeck() {
        Collections.shuffle(frenchDeck);
    }

    @Override
    public Stack<Card> extractCard() {
        this.extractedFromFrenchDeck.push(this.frenchDeck.pop());
        return this.extractedFromFrenchDeck;
    }
}
