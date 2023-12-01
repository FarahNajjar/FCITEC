
package fcitec;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



public class ReportTest {


    public void testGetIDCounter() {
        System.out.println("getIDCounter");
        int expResult = 1;
        int result = Report.getIDCounter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setIDCounter method, of class Report.
     */
    public void testSetIDCounter() {
        System.out.println("setIDCounter");
        int IDCounter = 0;
        Report.setIDCounter(IDCounter);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getReportNumber method, of class Report.
     */
    public void testGetReportNumber() {
        System.out.println("getReportNumber");
        Report instance = null;
        int expResult = 0;
        int result = instance.getReportNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of setReportNumber method, of class Report.
     */
    public void testSetReportNumber() {
        System.out.println("setReportNumber");
        int ReportNumber = 0;
        Report instance = null;
        instance.setReportNumber(ReportNumber);

    }

    /**
     * Test of getLocation method, of class Report.
     */
    public void testGetLocation() {
        System.out.println("getLocation");
        Report instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLocation method, of class Report.
     */
    public void testSetLocation() {
        System.out.println("setLocation");
        String Location = "";
        Report instance = null;
        instance.setLocation(Location);

    }

    /**
     * Test of getDescription method, of class Report.
     */
    public void testGetDescription() {
        System.out.println("getDescription");
        Report instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescription method, of class Report.
     */
    public void testSetDescription() {
        System.out.println("setDescription");
        String Description = "";
        Report instance = null;
        instance.setDescription(Description);

    }

    /**
     * Test of getStatus method, of class Report.
     */
    public void testGetStatus() {
        System.out.println("getStatus");
        Report instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStatus method, of class Report.
     */
    public void testSetStatus() {
        System.out.println("setStatus");
        String Status = "";
        Report instance = null;
        instance.setStatus(Status);

    }

    /**
     * Test of getUser method, of class Report.
     */
    public void testGetUser() {
        System.out.println("getUser");
        Report instance = null;
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);

    }

    /**
     * Test of setUser method, of class Report.
     */
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Report instance = null;
        instance.setUser(user);

    }

    /**
     * Test of ReportInfo method, of class Report.
     */
    @Test

    public void testaddInfo() {
        System.out.println("test Report Info");
        User user = new User("Aisha", "0553535507", "2105522");
        Report instance = new Report(21, "215F", "PANIC ATTACK", user, "new");
        assertNotNull(Report.getReports());
    }

   /**
     * Test of displayReports method, of class Report.
     */
 


    @Test
    public void testDisplayReports() {
        User user = new User("Njood", "0546783699", "2112360");
        Report instance = new Report(1, "145F", "Low Blood Pressure", user, "new");
        String result = Report.displayReports("2112360");
         assertNotNull(result);
        
      
    }


    
    /**
     * Test of searchByReportID method, of class Report.
     */
    @Test
    public void testSearchByReportNumber() {
        System.out.println("searchByReportNumber");
        ArrayList<Report> ReportL = null;
        int ReportNumber = 0;
        Report expResult = null;
        //Report result = Report.searchByReportID(ReportL, ID);
        //assertNull(expResult, result);

    }
   
    @After
    public void restoreSystemInStream() {
        // Restore System.in to the original stream after each test
        System.setIn(System.in);
    }

    @Test
   public void testDeleteReport() {
       User testUser = new User("Rawan", "05467382920", "211346");
       Report testReport = new Report(3,"230F", "PANIC ATTACK", testUser, "new");
       Report.getReports().add(testReport);
 
        Report.deleteReport(testReport.getReportNumber());
        
        assertTrue(Report.getReports().isEmpty());
    }

    
    /**
     * Test of changeStatus method, of class Report.
     */
 
   @Test
public void testChangeStatus() {
    System.out.println("changeStatus");

    // Create a test report
    User testUser = new User("shams", "0554673820", "11111111");
    Report testReport = new Report(2,"221F", "PANIC ATTACK", testUser, "new");
     Report.getReports().add(testReport);
    testReport.setStatus("Resolved");
    String exp = "Resolved";
    String result = testReport.getStatus();
    // Assert that the report status has been updated
    assertEquals(exp, result);
}


    /**
     * Test of toString method, of class Report.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User user = new User("Aisha", "057553507", "2105522");
        Report instance = new Report(1, "145F", "Low Blood Pressure", user, "new");
        String expResult ="\nReport Number: 1" 
                + "\nName: Aisha" 
                + "\nPhone Number: 057553507" 
                + "\nID: 2105522" 
                + "\nLocation: 145F"
                + "\nDescription: Low Blood Pressure"+ "\nReport Status: new";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


   

    
}