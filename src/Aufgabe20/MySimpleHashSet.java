package Aufgabe20;

import org.junit.runner.notification.Failure;

import java.lang.IllegalArgumentException;

/**
 * Created by Jojo on 10.06.16.
 */
public class MySimpleHashSet {




    Auto[] arr1 = new Auto[5];

    public void add(Auto auto) {

        if (size() < 5) {

            if (contains(auto) == false){

            int code = auto.hashCode();

            if (arr1[code] == null) {

                arr1[code] = auto;
            } else {

                for (int i = code; i < arr1.length; i++) {

                    if (arr1[i] == null) {
                        arr1[i] = auto;
                        break;
                    }

                    if (i == arr1.length && arr1[i] != null) {
                        for (int j = 0; j < code; j++) {

                            if (arr1[i] == null) {
                                arr1[i] = auto;
                                break;
                            }
                        }
                    }
                }
            }

            }



        }else{

            throw new IllegalArgumentException("Voll");

        }

    }

    public int size() {

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != null) {

                count++;

            }
        }

        return count;

    }

    public boolean contains(Auto a) {

        boolean checkcontain = false;
        for (int i = a.hashCode(); i < arr1.length; i++) {

            if (arr1[i] != null && arr1[i].equals(a)) {
                checkcontain = true;
                break;
            }
        }

        for (int i = 0; i < a.hashCode(); i++) {

            if (arr1[i] != null && arr1[i].equals(a)) {
                checkcontain = true;
                break;
            }

        }

        return checkcontain;
    }



}
