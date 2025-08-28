package org.skypro.skyshop;

public class Products {
        private String name; //имя продукта
        private int cost;  //стоимость продукта

    public Products(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public int getCost() {
            return cost;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public String toString() {
            return name + ": " + cost; // имя продукта: стоимость
        }
    }

