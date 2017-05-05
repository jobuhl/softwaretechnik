package Aufgabe1;

/**
 * Created by Jojo on 03.07.16.
 */
public class Auto2 {

    public void gibGas(int gewichtaufgaspedal){

        System.out.println(gewichtaufgaspedal);



         class Motor{

            public void spritzufuhr(int prozentvonmaximal){

                System.out.println(prozentvonmaximal);

            }
        }

        Motor m1 = new Motor();
        m1.spritzufuhr(30);

    }


    public static void main(String[] args) {
        Auto2 a2 = new Auto2();
        a2.gibGas(100);
    }
}
