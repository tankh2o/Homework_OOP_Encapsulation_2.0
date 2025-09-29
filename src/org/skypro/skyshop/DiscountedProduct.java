package org.skypro.skyshop;

class DiscountedProduct extends Products {
    private double basePrice;
    private double discounted;

    public DiscountedProduct(String name, double baseCost, double discounted) {
        super(name);
        this.basePrice = baseCost;
        this.discounted = discounted;
    }

    @Override
    public double getPrice() {
        return basePrice * (1 - discounted / 100.0);
    }

    @Override
    public String toString() {
        return getName() +
                " со скидкой: " + getPrice() +
                " (" + discounted + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
