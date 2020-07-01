package blackJack;

import cardManager.Card;
import cardManager.FrenchDeck;

public class BlackJack {
    FrenchDeck frenchDeck = new FrenchDeck();
    private int playerPoints;
    private int dealerPoints;

    public BlackJack(){
        normalizeValueOfCardsOverTen();
        shuffleDeck();
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public int getDealerPoints() {
        return this.dealerPoints;
    }

    public void setDealerPoints(int dealerPoints) {
        this.dealerPoints = dealerPoints;
    }

    public void normalizeValueOfCardsOverTen(){
        for (int i = 0; i < frenchDeck.getFrenchDeck().size(); i++) {
            if(frenchDeck.getFrenchDeck().get(i).getValue() > 10)
                frenchDeck.getFrenchDeck().get(i).setValue(10);
        }
    }

    public void shuffleDeck(){
        this.frenchDeck.shuffleDeck();
    }

    public Card extractCard(){
        /*Card extractedCard = this.frenchDeck.getFrenchDeck().get(0);
        this.frenchDeck.getFrenchDeck().remove(0);
        return extractedCard;*/
        return this.frenchDeck.extractCard().get(frenchDeck.getExtractedFromFrenchDeck().size()-1);
    }
}
