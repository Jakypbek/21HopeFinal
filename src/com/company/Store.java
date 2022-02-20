package com.company;

import com.company.products.*;

import java.time.LocalDate;
import java.util.Random;

public class Store{

    Random random = new Random();

    private Product[] range;
    private final Product[] productsInStore = new Product[20];
    private Product[] productsInIcebox;
    private Product[] productsInShowcase;

    public Store() {
    }

    public Store(Product[] range) {
        this.range = range;

        fullStore();
    }

    public void fullStore() {
        for (int i = 0; i < productsInStore.length; i++) {

            int a = random.nextInt(range.length);

                   if (a == 0) {
                productsInStore[i] = new Milk(range[0].getName(), range[0].getCrok());
            } else if (a == 1) {
                productsInStore[i] = new Fish(range[1].getName(), range[1].getCrok());
            } else if (a == 2) {
                productsInStore[i] = new Stew(range[2].getName(), range[2].getCrok());
            } else if (a == 3) {
                productsInStore[i] = new Salt(range[3].getName(), range[3].getCrok());
            } else {
                productsInStore[i] = new Corn(range[4].getName(), range[4].getCrok());
            }
        }

        setProducedOn();
        setLength();
    }

    public void setLength() {
        int a = random.nextInt(1, productsInStore.length);

        productsInIcebox = new Product[a];
        productsInShowcase = new Product[productsInStore.length - a];
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

        setStoragePlace();
        setFresh();
    }

    public void setProducedOn() {
        for (Product inStore : productsInStore) {
            inStore.setProducedOn(LocalDate.now().minusDays(random.nextInt(200)));
        }
    }

    public void setFresh() {
        for (Product product : productsInShowcase) {
            if (product.getClass().equals(Milk.class)) {
                product.setFresh(product.getProducedOn().plusDays(product.getCrok() / 2).isAfter(LocalDate.now()));
            } else if (product.getClass().equals(Fish.class)) {
                product.setFresh(product.getProducedOn().plusDays(product.getCrok() / 6).isAfter(LocalDate.now()));
            } else {
                product.setFresh(product.getProducedOn().plusDays(product.getCrok()).isAfter(LocalDate.now()));
            }
        }

        for (Product inIcebox : productsInIcebox) {
            inIcebox.setFresh(inIcebox.getProducedOn().plusDays(inIcebox.getCrok()).isAfter(LocalDate.now()));
        }
    }

    public void setStoragePlace() {
        for (Product inIcebox : productsInIcebox) {
            inIcebox.setStoragePlace("Холодильник");
        }

        for (Product product : productsInShowcase) {
            product.setStoragePlace("Ветрина");
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

    public void Sow() {
        for(Product val: productsInStore) {
            System.out.println(val);
        }
    }


    public void doInspection() {
        System.out.println("""
                                               Inspection result.
                      Product   |    Produced on    |  Storage place  | S. life days |    Fresh
                ----------------+-------------------+-----------------+--------------+---------------      
                """);
        for (Product val: productsInStore) {
            System.out.println(val);
        }
    }
}
