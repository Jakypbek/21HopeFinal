package com.company;

import java.time.LocalDate;

public abstract class Product{

    private String name;
    private int crok;
    private LocalDate producedOn;
    private String storagePlace;
    private boolean isFresh;

    public Product() {
    }

    public Product(String name, int crok) {
        this.name = name;
        this.crok = crok;
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

    @Override
    public String toString() {
        return name + "   |   " + producedOn + "   |   " + storagePlace + "   |   " + crok + "   |   " + isFresh;
    }
}
