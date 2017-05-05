package Aufgabe17;

import static org.junit.Assert.*;

/**
 * Created by Jojo on 09.06.16.
 */
public class EmailCheckTest {

    @org.junit.Test
    public void testCheckValidAdress() throws Exception {

        //assertTrue(EmailCheck.checkValidAdress("joachim-buhl@inf.ha.htwg-konsatnt.de"));

        assertTrue(EmailCheck.checkValidAdress("mail@test.de"));

        assertTrue(EmailCheck.checkValidAdress("super-student@inf.htwg-konstanz.de"));
        assertTrue(EmailCheck.checkValidAdress("rookie@inf-sem1.htwg-konstanz.de"));
        assertTrue(EmailCheck.checkValidAdress("4939@j999.gmx.de"));
        assertTrue(EmailCheck.checkValidAdress("1@a.net"));
        assertFalse(EmailCheck.checkValidAdress("mail@5aaa.org"));
        assertFalse(EmailCheck.checkValidAdress("mail.5aaa.org"));
        assertFalse(EmailCheck.checkValidAdress("mail@aaaa"));
        assertFalse(EmailCheck.checkValidAdress("mail@aaaa.ger"));


    }
}