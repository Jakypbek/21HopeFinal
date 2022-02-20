package com.company;

import com.company.products.Milk;
import com.company.products.Corn;
import com.company.products.Fish;
import com.company.products.Salt;
import com.company.products.Stew;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(new Product[] {
                new Milk("Молоко", 60),
                new Fish("Рыба", 20),
                new Stew("Тушенка", 180),
                new Salt("Соль", 1000000),
                new Corn("Кукуруза", 150)
        });

        store.placeProducts();
        store.doInspection();


    }
}
