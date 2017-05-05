package Aufgabe4;

import java.util.Objects;

/**
 * Created by Jojo on 18.03.16.
 */
public class Auto {

    private int fahrgestellnummer;
    private String type;
    private double fuel;
    private int tacho;
    private Fahrer driver;

    public Auto(int fahrgestellnummer, String type, double fuel, int tacho) {
        this.fahrgestellnummer = fahrgestellnummer;
        this.type = type;
        this.fuel = fuel;
        this.tacho = tacho;
        System.out.println();
    }

    public int getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(int fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getTacho() {
        return tacho;
    }

    public void setTacho(int tacho) {
        this.tacho = tacho;
    }

    public Fahrer getDriver() {
        return driver;
    }

    public void setDriver(Fahrer driver) {
        this.driver = driver;

        System.out.println(this.getDriver().getName() +  " steigt in " + this.getType() + " mit der Seriennummer " + this.getFahrgestellnummer()  );

    }

    public boolean equals(Object o){

        if(this == o){
            return true;
        }

        if(o == null || !(o instanceof Auto)){
            return false;
        }

        Auto a = (Auto) o;
        if (this.getType() == a.getType()){
            return true;
        } else{
            return false;
        }

    }

}
