package cardManager;

import java.util.ArrayList;
import java.util.Collections;

public class ItalianDeck implements Deck {
    ArrayList<Card> italianDeck = new ArrayList<>();
    ArrayList<Card> extractedFromItalianDeck = new ArrayList<>();

    public ItalianDeck(){
        deckFiller(this.italianDeck);
    }

    @Override
    public void deckFiller(ArrayList<Card> deck) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 11; j++) {
                switch (i){
                    case 0: deck.add(new Card(j, "Spade", true));
                    break;
                    case 2: deck.add(new Card(j, "Mazze", true));
                    break;
                    case 3: deck.add(new Card(j, "Oro", true));
                    break;
                    case 4: deck.add(new Card(j, "Coppe", true));
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
    public ArrayList<Card> extractCard() {
        this.extractedFromItalianDeck.add(this.italianDeck.get(0));
        this.italianDeck.remove(0);
        return this.extractedFromItalianDeck;
    }
}
