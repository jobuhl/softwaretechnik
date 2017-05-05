package Aufgabe1;

/**
 * Created by Jojo on 03.07.16.
 */
public class Auto4 {

    IMotor motor;

    public Auto4(IMotor motor) {

        this.motor = motor;
    }

    public void gibGas(int gewichtaufgaspedal){


        System.out.println(gewichtaufgaspedal);
        motor.spritzufuhr(gewichtaufgaspedal/10);
    }


    public static void main(String[] args) {
        Auto4 auto4 = new Auto4(new IMotor() {
            @Override
            public void spritzufuhr(int prozentvonmaximal) {
                System.out.println(prozentvonmaximal+prozentvonmaximal);
            }
        });



        auto4.gibGas(10);


    }
}
