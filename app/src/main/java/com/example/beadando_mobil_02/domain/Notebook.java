package com.example.beadando_mobil_02.domain;

public class Notebook {
    private String id;
    private String gyarto;
    private String tipus;
    private String ar;

    public Notebook(String id, String gyarto, String tipus, String ar) {
        this.id = id;
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.ar = ar;
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
}
