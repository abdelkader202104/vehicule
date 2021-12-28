package com.abdel;

public abstract class Vehicul {

    private String nom;
    private int nombreDeRoues;

    public Vehicul() {
    }

    public Vehicul(String nom, int nombreDeRoues) {
        this.nom = nom;
        this.nombreDeRoues = nombreDeRoues;
    }

    public abstract double vitesseMax();
}
