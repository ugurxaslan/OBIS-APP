package org.example.obis.travel_model;

import java.util.Objects;

public class Otobus {
    private String plaka;
    private int kapasite;
    private Durak currentStation;
    private BinisOtomati binisOtomati;
    private String guzergahAdi;

    public Otobus(String plaka, int kapasite, String guzergahAdi, BinisOtomati binisOtomati) {
        this.plaka = plaka;
        this.kapasite = kapasite;
        this.guzergahAdi = guzergahAdi;
        this.binisOtomati = binisOtomati;
    }

    //setter getter


    public void setGuzergahAdi(String guzergahAdi) {
        this.guzergahAdi = guzergahAdi;
    }

    public void setBinisOtomati(BinisOtomati binisOtomati) {
        this.binisOtomati = binisOtomati;
    }

    public void setCurrentStation(Durak currentStation) {
        this.currentStation = currentStation;
    }

    public String getPlaka() {
        return plaka;
    }

    public int getKapasite() {
        return kapasite;
    }

    public Durak getCurrentStation() {
        return currentStation;
    }

    public BinisOtomati getBinisOtomati() {
        return binisOtomati;
    }

    public String getGuzergahAdi() {
        return guzergahAdi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Otobus otobus = (Otobus) o;
        return Objects.equals(plaka, otobus.plaka);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(plaka);
    }
}
