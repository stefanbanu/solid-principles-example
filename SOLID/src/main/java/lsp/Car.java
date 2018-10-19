package lsp;

public class Car {
    int currentRange;
    int fuelLitersPer100Km;

    public void fuelUp(int gasLiters) {
        currentRange += 100 * (gasLiters/fuelLitersPer100Km);
    }

    public void drive(int range) {
        currentRange -= range;
    }

    public int getCurrentRange() {
        return currentRange;
    }

    public void setCurrentRange(int currentRange) {
        this.currentRange = currentRange;
    }

    public int getFuelLitersPer100Km() {
        return fuelLitersPer100Km;
    }

    public void setFuelLitersPer100Km(int fuelLitersPer100Km) {
        this.fuelLitersPer100Km = fuelLitersPer100Km;
    }
}
