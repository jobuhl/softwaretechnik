package Aufgabe2;

/**
 * Created by Jojo on 18.03.16.
 */
public class Applikation {

    private IDatabase database;

    public Applikation(IDatabase database) {
        this.database = database;
    }


    public void createDatabase(int a){
        database.createDatabase(a);
    }



}

