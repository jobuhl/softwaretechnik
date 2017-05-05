package Aufgabe5;

/**
 * Created by Jojo on 21.03.16.
 */
public class test {


    public static void main(String[] args) {

        Adresse a = new Adresse("Winzi", "7", 78456, "Koni");
        Adresse b = new Adresse("Winzig", "7", 78455, "Koni");

        Groesse c = new Groesse(10, 10, 10, 5000);
        Groesse d = new Groesse(20, 20, 5, 8000);


        Paeckchen e = new Paeckchen(a, c);
        Paeckchen f = new Paeckchen(b, d);
        Paeckchen g = new Paeckchen(a,d);

        System.out.println(e.equals(f));
        
    }
}
