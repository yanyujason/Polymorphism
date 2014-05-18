package bester;

public class Cookie implements Bestable{

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean isBetterThan(Bestable bestable) {
        return this.numberOfChocolateChips > ((Cookie)bestable).numberOfChocolateChips;
    }
}
