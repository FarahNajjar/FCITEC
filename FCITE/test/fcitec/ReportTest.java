/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aisha
 */
public class ReportTest {
    
    public ReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIDCounter method, of class Report.
     */
    @Test
    public void testGetIDCounter() {
        System.out.println("getIDCounter");
        int expResult = 0;
        int result = Report.getIDCounter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIDCounter method, of class Report.
     */
    @Test
    public void testSetIDCounter() {
        System.out.println("setIDCounter");
        int IDCounter = 0;
        Report.setIDCounter(IDCounter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportNumber method, of class Report.
     */
    @Test
    public void testGetReportNumber() {
        System.out.println("getReportNumber");
        Report instance = null;
        int expResult = 0;
        int result = instance.getReportNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportNumber method, of class Report.
     */
    @Test
    public void testSetReportNumber() {
        System.out.println("setReportNumber");
        int ReportNumber = 0;
        Report instance = null;
        instance.setReportNumber(ReportNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Report.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Report instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Report.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String Location = "";
        Report instance = null;
        instance.setLocation(Location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Report.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Report instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Report.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String Description = "";
        Report instance = null;
        instance.setDescription(Description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Report.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Report instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Report.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String Status = "";
        Report instance = null;
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Report.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Report instance = null;
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Report.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Report instance = null;
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReports method, of class Report.
     */
    @Test
    public void testDisplayReports() {
        System.out.println("displayReports");
        int userID = 0;
        Report.displayReports(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByReportID method, of class Report.
     */
    @Test
    public void testSearchByReportID() {
        System.out.println("searchByReportID");
        int ID = 0;
        Report expResult = null;
        Report result = Report.searchByReportID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReport method, of class Report.
     */
    @Test
    public void testDeleteReport() {
        System.out.println("deleteReport");
        int reportNumberToDelete = 0;
        Report.deleteReport(reportNumberToDelete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeStatus method, of class Report.
     */
    @Test
    public void testChangeStatus() {
        System.out.println("changeStatus");
        int reportNumberToChange = 0;
        Report.changeStatus(reportNumberToChange);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReportInfo method, of class Report.
     */
    @Test
    public void testReportInfo() {
        System.out.println("ReportInfo");
        User user = null;
        Report.ReportInfo(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }
    
}
