package Aufgabe2;

/**
 * Created by Jojo on 18.03.16.
 */
public class test {

    public static void main(String[] args) {
        Applikation app = new Applikation(new IDatabase() {
            @Override
            public void createDatabase(int number) {
                System.out.println(number + " awesomo");
            }

            @Override
            public void deleteDatabase(int number) {

                System.out.println(number + " miau");
            }
        });

        app.createDatabase(200);

    }
}
