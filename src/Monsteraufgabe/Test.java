package Monsteraufgabe;

/**
 * Created by Jojo on 18.06.16.
 */
public class Test {

    String test = "hello";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test1 = (Test) o;

        return test != null ? test.equals(test1.test) : test1.test == null;

    }

    @Override
    public int hashCode() {
        return test != null ? test.hashCode() : 0;
    }
}
