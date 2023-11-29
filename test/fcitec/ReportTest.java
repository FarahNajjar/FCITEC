/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author FARAH
 */
public class ReportTest {

    public ReportTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getIDCounter method, of class Report.
     */
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
    public void testReportInfo() {
        System.out.println("test Report Info");
        User user = new User("Aisha", "0553535507", "2105522");

        Report instance = new Report(21, "215F", "PANIC ATTACK", user, "new");
        Report.ReportInfo(user);

        String expResult = "";

    }

    /**
     * Test of displayReports method, of class Report.
     */
    @Test
    public void testDisplayReports() {
        System.out.println("displayReports");
        String userID = "2112360";
        Report.displayReports("2112360");
    }

    /**
     * Test of searchByReportID method, of class Report.
     */
    @Test
    public void testSearchByReportID() {
        System.out.println("searchByReportID");
        ArrayList<Report> ReportL = null;
        int ID = 0;
        Report expResult = null;
        Report.searchByReportID(ID);
        //Report result = Report.searchByReportID(ReportL, ID);
        //assertEquals(expResult, result);

    }

    /**
     * Test of deleteReport method, of class Report.
     */
    @Test
    public void testDeleteReport() {
        System.out.println("deleteReport");
        
        //Report.deleteReport(reportNumberToDelete);
    }

    /**
     * Test of changeStatus method, of class Report.
     */
    @Test
    public void testChangeStatus() {
        System.out.println("changeStatus");
        ArrayList<Report> reports = null;
        //Report.changeStatus(reports);

    }

    /**
     * Test of toString method, of class Report.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Report instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private User User(String aisha, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}