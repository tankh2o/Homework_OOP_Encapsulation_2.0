package org.skypro.skyshop;

public class App {
    public static void main(String[] args) {
        Products num1 = new SimpleProduct("Банан", 60);
        Products num2 = new SimpleProduct("Персик", 90);
        Products num3 = new FixPriceProduct("Киви");
        Products num4 = new DiscountedProduct("Яблоко", 30, 15);
        Products num5 = new DiscountedProduct("Ананас", 120, 20);



        ProductBasket basket = new ProductBasket();
        basket.add(num1);
        basket.add(num2);
        basket.add(num3);
        basket.add(num4);
        basket.add(num5);

        basket.printTheContent();

        System.out.println(basket.checkAvailability("Банан"));

        System.out.println(basket.checkAvailability("Киви"));

        System.out.println(basket.checkAvailability("Виноград"));

        basket.cartClean();

        basket.printTheContent();
    }
}
