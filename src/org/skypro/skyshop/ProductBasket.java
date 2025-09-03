package org.skypro.skyshop;

import java.util.Arrays;

public class ProductBasket {

    private final Products[] products = new Products[5];

    // 1. Метод добавления продукта в корзину: метод принимает в себя продукт и ничего не возвращает.
    public void add(Products product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Корзина заполнена.");
    }

    // 2. Метод получения общей стоимости корзины: метод ничего не принимает и возвращает целое число.
    //то есть метод должен перебрать все предметы в корзине
    //и вывести сумму стоимости каждого предмета
    public int totalCostOfTheBasket() {
        int sum = 0;
        for (Products product : products)
            if (product != null) {
                sum += product.getCost();
            }
        return sum;
    }

    //Метод печатает содержимое корзины: метод ничего не принимает и не возвращает,
    // но печатает в консоль сообщение вида:
    //<имя продукта>: <стоимость>
    //<имя продукта>: <стоимость>
    //Итого: <общая стоимость корзины> {else} В корзине ничего нет
    public void printTheContent() {
        System.out.println("Содержимое корзины: ");
        for (Products product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: " + totalCostOfTheBasket());
    }

    //Метод проверяет продукт в корзине по имени:
    // метод принимает в себя строку имени и возвращает boolean
    // в зависимости от того, есть продукт в корзине или его нет.
    public String checkAvailability(String productName) {
        for (Products product : products) {
            if (product.getName().equals(productName)) {
                return product.getName() + " присутствует в корзине";
            }
        }
        return productName + " отсутствует в корзине";
    }

    //Метод очистки корзины: метод ничего не принимает и очищает массив,
    // проставляя всем его элементам null
    public void cartClean() {
        Arrays.fill(products, null);
    }

}
