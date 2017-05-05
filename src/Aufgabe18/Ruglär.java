package Aufgabe18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Jojo on 10.06.16.
 */
public class Ruglär {


    public boolean check () {

        try {
            FileReader file = new FileReader("text.txt");
            BufferedReader bf = new BufferedReader(file);

            String zeile1 = bf.readLine();
            bf.close();


            System.out.println(zeile1);









        } catch (java.io.FileNotFoundException e){
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}
