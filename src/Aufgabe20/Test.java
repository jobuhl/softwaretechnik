package Aufgabe20;

import java.util.Arrays;

/**
 * Created by Jojo on 10.06.16.
 */
public class Test {

    public static void main(String[] args) {
        Auto a1 = new Auto("VW","rot");
        Auto a2 = new Auto("BMW","gelb");
        Auto a3 = new Auto("VW","lila");
        Auto a4 = new Auto("Audi","schwarz");
        Auto a5 = new Auto("Ford","blau");
        Auto a6 = new Auto("Ford","lilabalss");

        MySimpleHashSet set = new MySimpleHashSet();

        System.out.println(set.contains(a1));


    }
}
