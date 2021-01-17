package ru.job4j.oop;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            if(index <= 0) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            } else {
                products[index] = null;
            }
        }
        return products;
    }
}
