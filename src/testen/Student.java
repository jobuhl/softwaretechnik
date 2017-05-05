package testen;

/**
 * Created by Jojo on 05.07.16.
 */
public class Student {

    int numbet;
    String name;

    public Student(int numbet, String name) {
        this.numbet = numbet;
        this.name = name;
    }

    public int getNumbet() {
        return numbet;
    }

    public void setNumbet(int numbet) {
        this.numbet = numbet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
