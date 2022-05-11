package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    void singing () {
        System.out.println("The singer has a beautiful voice");

    }

    void playGuitar () {
        System.out.println("Playing with guitar");

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
