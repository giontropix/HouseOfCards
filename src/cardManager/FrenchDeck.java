package cardManager;

import java.util.ArrayList;
import java.util.Collections;

public class FrenchDeck implements Deck {
    ArrayList<Card> frenchDeck = new ArrayList<>();
    ArrayList<Card> extractedFromFrenchDeck = new ArrayList<>();

    public FrenchDeck(){
        deckFiller(this.frenchDeck);
    }

    @Override
    public void deckFiller(ArrayList<Card> deck) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
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
        Collections.shuffle(frenchDeck);
    }

    @Override
    public ArrayList<Card> extractCard() {
        this.extractedFromFrenchDeck.add(this.frenchDeck.get(0));
        this.frenchDeck.remove(0);
        return this.extractedFromFrenchDeck;
    }
}
