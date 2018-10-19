package lsp;

public class Tesla extends Car{

    private int maxRange;

   /* @Override
    public void fuelUp(int gasLiters) {
        throw new RunTimeException("You cannot fuel electric car.");
    }*/   // bad

    public void charge() {
        currentRange = maxRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }
}
