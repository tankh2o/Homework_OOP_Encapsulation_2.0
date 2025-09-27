package org.skypro.skyshop;

public class FixPriceProduct extends Products {
static final double FIXED_PRICE = 70;

    public FixPriceProduct(String name) {
        super(name);
    }

    public double getPrice(double FIXED_PRICE) {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
