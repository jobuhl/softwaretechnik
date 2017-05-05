package Aufgabe16;

/**
 * Created by Jojo on 27.05.16.
 */
public class Philosoph extends Thread{

    private int numberphilospoph;
    private Gabel rechts;
    private Gabel links;

    public Philosoph(int numberphilospoph, Gabel rechts, Gabel links) {
        this.numberphilospoph = numberphilospoph;
        this.rechts = rechts;
        this.links = links;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5 ; i++) {

            long waiting = (long)(Math.random()*1000);

            System.out.println("Philosoph " + this.numberphilospoph + " beginnt mit Gang " + (i+1));
            try {
                sleep(waiting);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (links.liegtAufTisch == true){
                links.greifeGabel(this);
                rechts.greifeGabel(this);
            }else if (links.liegtAufTisch != true){
                links.warteAuf(this);
            }

            System.out.println("Philosoph " + this.numberphilospoph + " beginnt zu essen");

            try {
                sleep(waiting);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            rechts.legeGabelHin(this);


        }

    }

    public int getNumberphilospoph() {
        return numberphilospoph;
    }
}
