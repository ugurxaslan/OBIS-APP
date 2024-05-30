package org.example.obis.travel_model;

import java.awt.geom.Point2D;
import java.util.Objects;

public class Durak {
    private String durakIsmi;
    private Point2D konum;
    private InisOtomati inisOtomati;

    // constructer
    public Durak(String durakIsmi, Point2D konum, InisOtomati inisOtomati) {
        this.durakIsmi = durakIsmi;
        this.konum = konum;
        this.inisOtomati = inisOtomati;
    }

    //setter -getter


    public String getDurakIsmi() {
        return durakIsmi;
    }

    public void setDurakIsmi(String durakIsmi) {
        this.durakIsmi = durakIsmi;
    }

    public Point2D getKonum() {
        return konum;
    }

    public void setKonum(Point2D konum) {
        this.konum = konum;
    }

    public InisOtomati getInisOtomati() {
        return inisOtomati;
    }

    public void setInisOtomati(InisOtomati inisOtomati) {
        this.inisOtomati = inisOtomati;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Durak durak = (Durak) o;
        return Objects.equals(durakIsmi, durak.durakIsmi) && Objects.equals(konum, durak.konum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durakIsmi, konum);
    }
}
