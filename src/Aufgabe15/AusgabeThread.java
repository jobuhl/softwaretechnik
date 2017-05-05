package Aufgabe15;

/**
 * Created by Jojo on 26.05.16.
 */
public class AusgabeThread extends Thread {

    private String txt;

    public AusgabeThread(String txt) {
        this.txt = txt;


    }

    @Override
    public void run() {



        for (int i = 0; i < 10 ; i++) {

            System.out.println(txt);
            try {
                Thread.sleep( (long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
