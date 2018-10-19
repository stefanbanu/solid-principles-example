package lsp;

// this also breaks the Liskov principle
public class FuelType {
    public void fill(Car car, int liters) {
        if (car instanceof Tesla) {
            ((Tesla) car).charge();
        }else {
            car.fuelUp(liters);
        }
    }
}

// there are many solutions
// ussally you can extract the functionality to an interface
