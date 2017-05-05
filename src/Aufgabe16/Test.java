package Aufgabe16;

/**
 * Created by Jojo on 27.05.16.
 */
public class Test {


    public static void main(String[] args) {
        Gabel g1 = new Gabel(1);
        Gabel g2 = new Gabel(2);
        Gabel g3 = new Gabel(3);
        Gabel g4 = new Gabel(4);
        Gabel g5 = new Gabel(5);

        Philosoph p1 = new Philosoph(1,g2,g1);
        Philosoph p2 = new Philosoph(2,g3,g2);
        Philosoph p3 = new Philosoph(3,g4,g3);
        Philosoph p4 = new Philosoph(4,g5,g4);
        Philosoph p5 = new Philosoph(5,g1,g5);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

    }
}
