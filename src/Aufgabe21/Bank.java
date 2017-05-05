package Aufgabe21;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jojo on 15.06.16.
 */
public class Bank {

    private  String blz;
    private  String name;

    private Map<String, Kunde> list= new HashMap<String, Kunde>();

    public Bank(String blz, String name) {
        this.blz = blz;
        this.name = name;
    }

    public String getBlz() {
        return blz;
    }

    public String getName() {
        return name;
    }

    public void kundeAnlegen(Kunde kunde){

        list.put(kunde.getKundennr(),kunde);

    }

    public void kundenAusgabe(){

        System.out.println("Bank: " + this.name + " Kundenanzahl  " + list.size());

        for (String k: list.keySet()) {
            System.out.println(list.get(k).toString() + " " + list.get(k).getSet().toString());

        }
        System.out.println();

    }


}
