package Lambdas;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntPredicate;

/**
 * Created by Jojo on 04.07.16.
 */
public class Lamda {



    public static void main(String[] args) {
        DoubleBinaryOperator methode = (a, b) -> a / b;
        System.out.println(berechnen(4.0, 10,methode));
    }

    public static double berechnen(double a, double b, DoubleBinaryOperator methode){
        return methode.applyAsDouble(a,b);
    }


}
