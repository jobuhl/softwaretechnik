package Aufgabe15;

/**
 * Created by Jojo on 26.05.16.
 */
public class Test {

    public static void main(String[] args) {

        AusgabeThread t1 = new AusgabeThread("Hallo");
        AusgabeThread t2 = new AusgabeThread("Dr");
        AusgabeThread t3 = new AusgabeThread("Johner");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("");
        System.out.println("habe Fertig");

    }
}
