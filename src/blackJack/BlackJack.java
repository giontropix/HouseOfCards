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
        return dealerPonts;
    }

    public void setDealerPonts(int dealerPonts) {
        this.dealerPonts = dealerPonts;
    }

    public void shuffleDeck(){
        frenchDeck.shuffleDeck();
    }

    public Card extractCard(){
        return frenchDeck.extractCard().get(0);
    }

    public void dealerGame(){
        extractCard();
        dealerPonts = extractCard().getValue();
        if(dealerPonts < 17) {
            Card extractedCard = frenchDeck.extractCard().get(0);
            dealerPonts += extractedCard.getValue();
        }
    }

}
