package Monsteraufgabe;

import java.util.GregorianCalendar;

/**
 * Created by Jojo on 18.06.16.
 */
public class Patient {

    private static int counter;
    private int patientnr;

    private String firstname;
    private String lastname;
    private String saftynumber;
    private GregorianCalendar birthday;

    public Patient(String firstname, String lastname, String saftynumber, int day, int month, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.saftynumber = saftynumber;
        this.birthday = new GregorianCalendar(year, month, day);

        counter++;
        patientnr = counter;
    }

    public boolean equal(Object o) {

        if (o == this) {
            return true;
        } else {
            if (o == null || !(o instanceof Patient)) {
                return false;
            } else {

                if (((Patient) o).saftynumber.equals(this.saftynumber) && ((Patient) o).firstname.equals(this.firstname) && ((Patient) o).birthday.equals(this.birthday)) {

                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public int hashCode(){

        for (int i = 0; i < firstname.length() ; i++) {

            System.out.println(i);

        }
        return 1;

    }




}
