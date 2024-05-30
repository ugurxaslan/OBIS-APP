package org.example.obis.travel_model;

import java.util.Objects;

public class Kart {

    private String kartNo;
    private Yolcu kartSahibi;
    private boolean kartTipi;//öğrenci
    private int bakiye;

    public Kart(int bakiye, boolean kartTipi, Yolcu kartSahibi, String kartNo) {
        this.bakiye = bakiye;
        this.kartTipi = kartTipi;
        this.kartSahibi = kartSahibi;
        this.kartNo = kartNo;
    }

    //setter getter

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public Yolcu getKartSahibi() {
        return kartSahibi;
    }

    public void setKartSahibi(Yolcu kartSahibi) {
        this.kartSahibi = kartSahibi;
    }

    public boolean isKartTipi() {
        return kartTipi;
    }

    public void setKartTipi(boolean kartTipi) {
        this.kartTipi = kartTipi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {

        this.bakiye = bakiye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kart kart = (Kart) o;
        return Objects.equals(kartNo, kart.kartNo) && Objects.equals(kartSahibi, kart.kartSahibi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kartNo);
    }
}
