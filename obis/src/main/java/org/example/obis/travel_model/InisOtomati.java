package org.example.obis.travel_model;

import java.util.Objects;

public class InisOtomati extends Otomat{

    private  Durak bulunduguDurak;

    public InisOtomati(int id,Durak bulunduguDurak) {
        super(id);
        this.bulunduguDurak = bulunduguDurak;
    }

    public String popYolcu(Kart kart){
        return "";
    }

    //settter -getter
    public Durak getBulunduguDurak() {
        return bulunduguDurak;
    }

    public void setBulunduguDurak(Durak bulunduguDurak) {
        this.bulunduguDurak = bulunduguDurak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InisOtomati that = (InisOtomati) o;
        return Objects.equals(this.bulunduguDurak, that.bulunduguDurak);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.getId());
    }

}
