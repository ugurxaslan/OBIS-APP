package org.example.obis.travel_model;

import java.util.Date;
import java.util.Objects;

public class Yolcu {
    private String tckn;
    private String adSoyad;
    private Date dogumTarihi;
    private Kart kart;
    private Otobus hangiOtobuste;

    public Yolcu(String tckn, String adSoyad, Date dogumTarihi, Kart kart) {
        this.tckn = tckn;
        this.adSoyad = adSoyad;
        this.dogumTarihi = dogumTarihi;
        this.kart = kart;
    }

    //setter getter


    public String getTckn() {
        return tckn;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public Kart getKart() {
        return kart;
    }

    public Otobus getHangiOtobuste() {
        return hangiOtobuste;
    }

    public void setKart(Kart kart) {
        this.kart = kart;
    }

    public void setHangiOtobuste(Otobus hangiOtobuste) {
        this.hangiOtobuste = hangiOtobuste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yolcu yolcu = (Yolcu) o;
        return Objects.equals(tckn, yolcu.tckn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tckn);
    }
}
