package Aufgabe17;

/**
 * Created by Jojo on 09.06.16.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {

    public static boolean checkValidAdress(String email){

        Pattern pattern = Pattern.compile(
                "\\w+" +            //Erste Zeichen(bis -)
                        "\\-?"+     //Trennzeichen
                        "\\w*"+     //folgende Zeichen
                        "@"+        //@ Zeichen
                        "[a-zA-Z]+"+//Zeichen
                        "\\w*"+
                        "(((\\.|\\-)\\w+)*)?"+
                        "(\\.de|\\.org|\\.net|\\.info|\\.com)");

        Matcher matcher = pattern.matcher(email);

        boolean m = matcher.matches();
        System.out.println(m);



        return m;
    }
}
