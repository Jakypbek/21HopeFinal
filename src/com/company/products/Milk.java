package com.company.products;

import com.company.Product;

import java.time.LocalDate;
import java.util.Random;

public class Milk extends Product {

    Random random = new Random();

    public Milk() {
    }

    public Milk(String name, int crok) {
        super(name, crok);
    }

    @Override
    public void isFresh() {
        super.isFresh();
    }

}
