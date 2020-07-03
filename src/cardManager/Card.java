package cardManager;

public class Card {
    private int value;
    private final String seed;
    private boolean covered;
    private boolean cardOfDealer;

    public Card(int value, String seed, boolean covered, boolean cardOfDealer){
        this.value = value;
        this.seed = seed;
        this.covered = covered;
        this.cardOfDealer = cardOfDealer;
    }

    public boolean isCardOfDealer() {
        return cardOfDealer;
    }

    public void setCardOfDealer(boolean cardOfDealer) {
        this.cardOfDealer = cardOfDealer;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSeed() {
        return seed;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }
}
