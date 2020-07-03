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

    public void setAssoToEleven(){
        for (int i = 0; i < frenchDeck.getExtractedFromFrenchDeck().size(); i++) {
            if (!frenchDeck.getExtractedFromFrenchDeck().get(i).isCardOfDealer() && frenchDeck.getExtractedFromFrenchDeck().get(i).getValue() == 1)
                frenchDeck.getExtractedFromFrenchDeck().get(i).setValue(11);
        }
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
        return this.frenchDeck.extractCard().get(frenchDeck.getExtractedFromFrenchDeck().size()-1);
    }
}
