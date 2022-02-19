package com.company;

import java.time.LocalDate;
import java.util.Random;

public abstract class Product{

    Random random = new Random();

    private String name;
    private int crok;
    private LocalDate producedOn;
    private Object storagePlace;
    private boolean isFresh;

    public Product() {
    }

    public Product(String name, int crok) {
        this.name = name;
        this.crok = crok;
    }

    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    public void isFresh() {
        if (producedOn.plusDays(200).isAfter(LocalDate.now())) {
            this.isFresh = true;
        } else {
            this.isFresh = false;
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", crok=" + crok +
                ", producedOn=" + producedOn +
                ", storagePlace=" + storagePlace +
                ", isFresh=" + isFresh +
                "} " + super.toString();
    }
}
