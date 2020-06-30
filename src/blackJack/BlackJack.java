package blackJack;

import cardManager.Card;
import cardManager.FrenchDeck;

public class BlackJack {
    FrenchDeck frenchDeck = new FrenchDeck();
    private int playerPoints;
    private int dealerPonts;

    public BlackJack(){
        shuffleDeck();
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public int getDealerPonts() {
        return this.dealerPonts;
    }

    public void setDealerPonts(int dealerPonts) {
        this.dealerPonts = dealerPonts;
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
