package Aufgabe1;

/**
 * Created by Jojo on 03.07.16.
 */
public class Auto {


    public void gibGas(int gewichtaufgaspedal){

        System.out.println(gewichtaufgaspedal);
        Motor m1 = new Motor();
        m1.spritzufuhr(10);

    }

     class Motor{


        public void spritzufuhr(int prozentvonmaximal){


            System.out.println(prozentvonmaximal);
        }
    }

   public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.gibGas(20);

    }

}
