package testen;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Jojo on 05.07.16.
 */
public class Testen {

    Collection<Student> list = new HashSet<>();

    public void add(Student stud){

        list.add(stud);
    }

    public void remove(Student stud){

        list.remove(stud);

    }


    public static void main(String[] args) {

        Testen test = new Testen();
        Student a1 = new Student(1,"zwei");
        Student a2 = new Student(1,"zwei");

        test.add(a1);

    }
}