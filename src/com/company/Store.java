package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Store{

    Random random = new Random();

    private Product[] range;
    private Product[] productsInStore = new Product[20];
    private Product[] productsInIcebox;
    private Product[] productsInShowcase;

    public Store() {
    }

    public Store(Product[] range) {
        this.range = range;
    }

    public void fullStore() {
        for (int i = 0; i < 20; i++) {
            productsInStore[i] = range[random.nextInt(range.length)];
        }

    }

    public void setLength() {
        int a = 1;
        int b = 1;
        for (int i = 0; i < 20; i++) {
            if (random.nextInt(2) % 2 == 0) {
                productsInIcebox = new Product[a];
                a++;
            } else {
                productsInShowcase = new Product[b];
                b++;
            }
        }
    }

    public void placeProducts() {
        int a = 0;
        for (int i = 0; i < productsInIcebox.length; i++) {
            productsInIcebox[i] = productsInStore[a];
            a++;
        }
        for (int i = 0; i < productsInShowcase.length; i++) {
            productsInShowcase[i] = productsInStore[a];
            a++;
        }
    }

    public void test() {
        for (int i = 0; i < productsInIcebox.length; i++) {
            productsInIcebox[i].setProducedOn(LocalDate.now().minusDays(random.nextInt(200)));
        }
        for (int i = 0; i < productsInIcebox.length; i++) {
            productsInIcebox[i].setProducedOn(LocalDate.now().minusDays(random.nextInt(200)));
        }
    }



    public void showAll() {
        System.out.println("Showcase");
        for (Product val: productsInShowcase) {
            System.out.println(val);
        }

        System.out.println("-------------------------------");
        System.out.println("Icebox");

        for (Product val: productsInIcebox) {
            System.out.println(val);
        }
    }
}
