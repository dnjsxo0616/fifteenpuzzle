package domain;

public class TurnCount {
    private int turnCount = 0;

    public void increaseCount() {
        turnCount++;
    }

    public int getTurnCount() {
        return turnCount;
    }
}
