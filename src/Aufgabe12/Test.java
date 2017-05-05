package Aufgabe12;

/**
 * Created by Jojo on 09.05.16.
 */
public class Test {

    public static void main(String[] args) {
        Object[] parameter = {"Julia",23};

        RPC getVelues = new RPC("Aufgabe12.Kind",parameter,"setName","Ulli");
        getVelues.reflect();
    }
}
