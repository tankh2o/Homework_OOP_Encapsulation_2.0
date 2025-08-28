package org.skypro.skyshop;

public class App {
    public static void main(String[] args) {
        Products num1 = new Products("banana", 50);
        Products num2 = new Products("ban", 500);
        Products num3 = new Products("la", 55);
        Products num4 = new Products("caca", 15);
        Products num5 = new Products("za", 100);

        ProductBasket basket = new ProductBasket();
        basket.add(num1);
        basket.add(num2);
        basket.add(num3);
        basket.add(num4);
        basket.add(num5);

        basket.printTheContent();

        System.out.println(basket.checkAvailability("caca"));

        System.out.println(basket.checkAvailability("nana"));

        System.out.println(basket.checkAvailability("abc"));

        basket.cartClean();

        basket.printTheContent();
    }
}
