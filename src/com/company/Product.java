package com.company;

import java.time.LocalDate;

public abstract class Product{

    private String name;
    private int crok;
    private String INF;
    private LocalDate producedOn;
    private String storagePlace;
    private boolean isFresh;

    public Product() {
    }

    public Product(String name, int crok) {
        this.name = name;
        this.crok = crok;
    }

    public Product(String name, String inf) {
        this.name = name;
        if (inf.equals("INF")) {
            this.crok = 1000000000;
            this.INF = inf;
        } else {
            System.out.println("Invalid value to crok");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrok() {
        return crok;
    }

    public void setCrok(int crok) {
        this.crok = crok;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String getINF() {
        return INF;
    }

    public void setINF(String INF) {
        this.INF = INF;
    }

    @Override
    public String toString() {

        StringBuilder a = new StringBuilder(" ");

        for (int i = 9; i > name.length(); i--) {
            a.append(" ");
        }

        StringBuilder b = new StringBuilder(" ");

        if (crok / 100 == 0) {
            b.append(" ");
        }

        return "   " + name + a + "   |     " + producedOn + "     |   " + storagePlace + "   |      " + crok + b + "    |    " + isFresh;
    }
}
