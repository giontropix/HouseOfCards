package cardManager;

public class Card {
    private int value;
    private final String seed;
    private boolean covered;

    public Card(int value, String seed, boolean covered){
        this.value = value;
        this.seed = seed;
        this.covered = covered;
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
