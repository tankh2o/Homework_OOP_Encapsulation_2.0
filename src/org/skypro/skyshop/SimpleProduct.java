package org.skypro.skyshop;

class SimpleProduct extends Products {
    double price;

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

    @Override
    public boolean isSpecial() {
        return false;
    }
}
