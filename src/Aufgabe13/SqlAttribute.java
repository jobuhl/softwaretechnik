package Aufgabe13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Jojo on 07.05.16.
 */

//Sichtbar zur Laufzeit
@Retention(RetentionPolicy.RUNTIME)

//Method falls man noch Methoden Annotieren möchte, Field da die Aufgabe das zwingend erfordert
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface SqlAttribute {

     boolean persist();

     SQLType sqlType();

     String columnname();
}
