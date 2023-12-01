/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aisha
 */
public class UserTest {

    /**
     * Test of userInfo method, of class User.
     */
    @Test
    public void testUserInfo() {
        System.out.println("AddUser");
        User instance = new User("Aisha", "051593509", "2105522");
        assertNotNull(instance.getId());
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Report.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User("Aisha", "052553505", "2105522");
        String expResult = "name: Aisha"
                + "\nPhone Number: 052553505"
                + "\nID: 2105522";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}