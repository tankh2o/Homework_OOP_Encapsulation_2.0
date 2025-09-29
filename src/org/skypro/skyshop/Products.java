package org.skypro.skyshop;

abstract class Products {
    private String name; //имя продукта

    public Products(String name) {
        this.name = name;
    }

    public double getPrice() {        return 0;    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }

    public boolean isSpecial() {
        return false;
    }
}

