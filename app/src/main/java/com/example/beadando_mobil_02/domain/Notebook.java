package com.example.beadando_mobil_02.domain;

public class Notebook {
    private String id;
    private String gyarto;
    private String tipus;
    private String ar;
    private String kijelzo;
    private String memoria;
    private String merevlemez;
    private String videovezerlo;

    public Notebook(String id, String gyarto, String tipus, String ar, String kijelzo, String memoria, String merevlemez, String videovezerlo) {
        this.id = id;
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.ar = ar;
        this.kijelzo = kijelzo;
        this.memoria = memoria;
        this.merevlemez = merevlemez;
        this.videovezerlo = videovezerlo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getKijelzo() {
        return kijelzo;
    }

    public void setKijelzo(String kijelzo) {
        this.kijelzo = kijelzo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getMerevlemez() {
        return merevlemez;
    }

    public void setMerevlemez(String merevlemez) {
        this.merevlemez = merevlemez;
    }

    public String getVideovezerlo() {
        return videovezerlo;
    }

    public void setVideovezerlo(String videovezerlo) {
        this.videovezerlo = videovezerlo;
    }
}
