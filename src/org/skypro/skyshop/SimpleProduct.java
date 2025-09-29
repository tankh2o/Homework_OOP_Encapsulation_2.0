package org.skypro.skyshop;

class SimpleProduct extends Products {
   private double price;

    public SimpleProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public SimpleProduct(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() +
                ": " + getPrice();
    }
}
