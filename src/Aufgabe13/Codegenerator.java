package Aufgabe13;

import java.lang.reflect.Field;


/**
 * Created by Jojo on 07.05.16.
 */
public class Codegenerator {


    //unterschied zwischen Annotation und Annotations?
    public static void main(String[] args) {
        Field[] feld1 = Studentin.class.getDeclaredFields();

        System.out.print("CREATE TABLE studentin (");

        SQLType anno1 = feld1[0].getAnnotation(SqlAttribute.class).sqlType();
        SQLType anno2 = feld1[1].getAnnotation(SqlAttribute.class).sqlType();

        String name1 = feld1[0].getAnnotation(SqlAttribute.class).columnname();
        String name2 = feld1[1].getAnnotation(SqlAttribute.class).columnname();


        System.out.print(name1 + " " + anno1 + ", ");
        System.out.print(name2 + " " + anno2 + " (30));");

    }
}

