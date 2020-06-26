package memory;
import cardManager.*;

import java.util.ArrayList;

public class Memory {
    int row;
    int column;
    int point = 0;
    Card[][] gridOfCards;
    ItalianDeck italianDeck = new ItalianDeck();
    ItalianDeck italianDeck2 = new ItalianDeck();
    ArrayList<Card> deck = new ArrayList<>();

    public Memory(int row, int column){
        gridOfCards = new Card[row][column];
        this.row = row;
        this.column = column;
        extractCard();
        shuffleCard();
        fillerMemory();
    }

    public void extractCard(){
        int numberOfCard = (this.row*this.column)/2;
        for (int i = 0; i < numberOfCard; i++) {
            deck.add(italianDeck.extractCard().get(i));
            deck.add(italianDeck2.extractCard().get(i));
        }
    }

    public void shuffleCard(){
        italianDeck.shuffleDeck(deck);
    }

    public void fillerMemory(){
        for (int i = 0, x = 0; i < gridOfCards.length; i++) {
            for (int j = 0; j < gridOfCards[i].length; j++, x++) {
                gridOfCards[i][j] = deck.get(x);
            }
        }
    }

    public void uncoverCard(int i, int j){
        gridOfCards[i][j].setCovered(false);
    }

    public boolean areCardsEqual(Card card1, Card card2){
        if (!(card1.getValue() == card2.getValue()) || !(card1.isCovered() == card2.isCovered())) {
            card1.setCovered(true);
            card2.setCovered(true);
            return false;
        }
        else return true;
    }

    public boolean isWin(){
        for (Card[] gridOfCard : gridOfCards) {
            for (Card card : gridOfCard) {
                if (card.isCovered())
                    return false;
            }
        }
        return true;
    }

    public int getPoint() {
        return point;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card[] gridOfCard : this.gridOfCards) {
            result.append("[");
            for (Card card : gridOfCard) {
                if (card.isCovered())
                    result.append("[      ]");
                else
                    result.append("[").append(card.getSeed()).append(card.getValue()).append("]");
            }
            result.append("]\n");
        }
        return result.toString();
    }
}