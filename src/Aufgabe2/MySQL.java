package Aufgabe2;

/**
 * Created by Jojo on 18.03.16.
 */
public class MySQL implements IDatabase {

    @Override
    public void createDatabase(int number) {
        System.out.println(number + "awesomo" );
    }

    @Override
    public void deleteDatabase(int number) {

        System.out.println(number + "miau" );

    }
}
