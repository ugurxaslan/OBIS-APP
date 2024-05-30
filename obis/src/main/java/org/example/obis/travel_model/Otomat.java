package org.example.obis.travel_model;

public abstract class Otomat {

    private int id;

    public Otomat(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
