package isp;

public interface ShoppingCart {

    // also violating ocp
    public void addItem();
    public void removeItem();
    public void calculateTotal();
    public void checkout();
    public void clearCart();
}
