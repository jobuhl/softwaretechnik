package Aufgabe11;

import java.io.*;

/**
 * Created by Jojo on 07.05.16.
 */
public class DBWrapper extends PoorMansDatabase {

    public DBWrapper(String filename) throws IOException {
        super(filename);
    }

    @Override
    public void save(int key, String value) throws IOException {
        super.save(key, value);
    }

    @Override
    public String load(int key) throws IOException {
        return super.load(key);
    }
}

