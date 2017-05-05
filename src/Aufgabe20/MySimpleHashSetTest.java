package Aufgabe20;

import static org.junit.Assert.*;

/**
 * Created by Jojo on 17.06.16.
 */
public class MySimpleHashSetTest {
    MySimpleHashSet set = new MySimpleHashSet();
    Auto a1 = new Auto("A1", "rot");
    Auto aw = new Auto("A1", "weiß");
    Auto a3 = new Auto("A3", "rot");
    Auto bmw = new Auto("BMW", "rot");
    Auto mb = new Auto("Maybach", "schwarz");
    Auto vw = new Auto("Golf", "weiß");

    @org.junit.Test
    public final void testAll() {
        //Leeres Set
        assertEquals(0, set.size());
        assertFalse(set.contains(a1));

        //1. Wert
        set.add(a1);
        assertEquals(1, set.size());
        assertTrue(set.contains(a1));

        set.add(aw);
        set.add(a3);
        assertEquals(3, set.size());
        assertTrue(set.contains(aw));
        assertFalse(set.contains(mb));

        set.add(aw);
        assertEquals(3, set.size());
        assertTrue(set.contains(aw));


        set.add(bmw);
        set.add(mb);

        try {
            set.add(vw);
            fail("An error should have occured");
        } catch (Exception e){
            System.out.println("Expected exception");
        }
        System.out.println("Fertig");
    }

}