package Aufgabe20;

import static org.junit.Assert.*;

/**
 * Created by Jojo on 17.06.16.
 */
public class AutoTest {
    Auto a1 = new Auto("A1", "rot");
    Auto aw = new Auto("A1", "weiß");
    Auto a3 = new Auto("A3", "rot");
    Auto bmw = new Auto("BMW", "rot");
    Auto mb = new Auto("Maybach", "schwarz");
    Auto vw = new Auto("Golf", "weiß");


    @org.junit.Test
    public final void testHashcode(){
        assertTrue(a1.hashCode() != aw.hashCode());
        assertTrue(a1.hashCode() == a1.hashCode());
        assertTrue(aw.hashCode() != vw.hashCode());
        assertTrue(mb.hashCode() != bmw.hashCode());

        assertTrue(a1.hashCode() >= 0);
        assertTrue(a1.hashCode() <= 4);
    }


    @org.junit.Test
    public final void testEquals(){
        assertTrue(a1.equals(a1));
        assertFalse(a1.equals(aw));
        assertFalse(a1.equals(null));
        assertFalse(bmw.equals(mb));
        assertFalse(a1.equals("A1"));
    }
}