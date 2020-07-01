package cardManager;

import java.util.ArrayList;
import java.util.Collections;

public class FrenchDeck implements Deck {
    ArrayList<Card> frenchDeck = new ArrayList<>();
    ArrayList<Card> extractedFromFrenchDeck = new ArrayList<>();

    public FrenchDeck(){
        deckFiller(this.frenchDeck);
    }

    public ArrayList<Card> getExtractedFromFrenchDeck() {
        return extractedFromFrenchDeck;
    }

    public ArrayList<Card> getFrenchDeck() {
        return frenchDeck;
    }

    @Override
    public void deckFiller(ArrayList<Card> deck) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                switch (i){
                    case 0: deck.add(new Card(j, "Cuori", true));
                        break;
                    case 2: deck.add(new Card(j, "Picche", true));
                        break;
                    case 3: deck.add(new Card(j, "Quadri", true));
                        break;
                    case 4: deck.add(new Card(j, "Fiori", true));
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
