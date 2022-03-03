package com.company.products;

import com.company.Product;

public class Salt extends Product{

    public Salt() {
    }

    public Salt(String name, int crok) {
        super(name, crok);
    }

    public Salt(String name, String inf) {
        super(name, inf);
    }

    @Override
    public String toString() {

        StringBuilder a = new StringBuilder(" ");

        for (int i = 9; i > getName().length(); i--) {
            a.append(" ");
        }

        return "   " + getName() + a + "   |     " + getProducedOn() + "     |   " + getStoragePlace() + "   |      " + getINF() + "     |    " + isFresh();
    }
}
