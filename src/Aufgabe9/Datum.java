package Aufgabe9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Jojo on 29.04.16.
 */
public class Datum {

    public static void main(String[] args) {
        GregorianCalendar jul = new GregorianCalendar(1998,07,23);

        SimpleDateFormat sdf = new SimpleDateFormat("E");

        System.out.println(sdf.format(jul.getTime()));

        // Der 23.07.1998 war ein Dienstag

        GregorianCalendar jul1 = new GregorianCalendar(1998,07,23);
        jul1.add(Calendar.DAY_OF_YEAR, 223);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(sdf1.format(jul1.getTime()));


        String date = "23. Juli 1988";
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd. MMM yyyy");

        try {
            Date a = sdf2.parse(date);
            GregorianCalendar lastParse = new GregorianCalendar();
            lastParse.setTime(a);

            System.out.println(sdf2.format(lastParse.getTime()));


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
            }
