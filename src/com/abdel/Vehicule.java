package com.abdel;

public abstract class Vehicule {

    private String nom;
    private int nombreDeRoues;

    public Vehicule() {
    }

    public Vehicule(String nom, int nombreDeRoues) {
        this.nom = nom;
        this.nombreDeRoues = nombreDeRoues;
    }

    public abstract double vitesseMax();
}
