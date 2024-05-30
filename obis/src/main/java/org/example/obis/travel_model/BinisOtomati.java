package org.example.obis.travel_model;

import java.util.Objects;

public class BinisOtomati extends Otomat{
    private Otobus bulunduguOtobus;

    public BinisOtomati(int id,Otobus otobus) {
        super(id);
        this.bulunduguOtobus = otobus;
    }

    public String insertYolcu(Kart kart){
        return "";
    }

    public String seferBaslat(){
        return "";
    }

    public String seferBitir(){
        return "";
    }

    //getter-setter

    public Otobus getBulunduguOtobus() {
        return bulunduguOtobus;
    }

    public void setBulunduguOtobus(Otobus bulunduguOtobus) {
        this.bulunduguOtobus = bulunduguOtobus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinisOtomati that = (BinisOtomati) o;
        return Objects.equals(this.bulunduguOtobus, that.bulunduguOtobus);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.getId());
    }
}
