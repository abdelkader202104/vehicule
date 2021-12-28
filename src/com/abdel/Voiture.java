package com.abdel;

public class Voiture extends Vehicul{
    public Voiture(String nom, int nombreDeRoues) {
        super(nom, nombreDeRoues);
    }


    @Override
    public double vitesseMax() {
        return 230;
    }

    public String caracteristique(){



        return String.valueOf(vitesseMax()) + " Km/H";
    }

}
