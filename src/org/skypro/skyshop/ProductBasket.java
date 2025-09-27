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
                sum += product.getPrice();
            }
        return sum;
    }

    //А) Метод печатает содержимое корзины: метод ничего не принимает и не возвращает,
    // но печатает в консоль сообщение вида:
    //<имя продукта>: <стоимость>
    //<имя продукта>: <стоимость>
    //Итого: <общая стоимость корзины> {else} В корзине ничего нет

    //Б) Изменения:
    //создаются два дополнительных метода
    //<имя продукта>: <стоимость>
    //<имя продукта со скидкой>: <стоимость> (<скидка>%)
    //<имя продукта с фиксированной ценой>: Фиксированная цена <значение константы фиксированной цены>
    //Итого: <общая стоимость корзины>
    //Специальных товаров: <Количество специальных товаров>
    public void printTheContent() {
        System.out.println("Содержимое корзины: ");
        for (Products product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: " + totalCostOfTheBasket());
    }

    public int SpecialProducts(){
        int specialCount = 0;
        for (Products product : products) {
            if (product.isSpecial()) // Используем метод isSpecial для проверки
                {
                specialCount++; // Увеличиваем счетчик, если товар специальный
            }
        }
        return specialCount; // Возвращаем количество специальных товаров
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder(); // создается объект StringBuilder,
                                                    // который используется для эффективной сборки строк
        for (Products product : products) {
            result.append(product.toString()).append("\n"); //Для каждого товара вызывается его метод toString()
                                                           // и результат добавляется в result с новой строкой \n.
        }
        result.append("Итого: ").append(totalCostOfTheBasket()).append("\n");
        result.append("Специальных товаров: ").append(SpecialProducts());
        return result.toString();
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
