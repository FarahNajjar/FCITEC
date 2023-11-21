
package fcitec;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.LinkedList;


/**
 *
 * @author njood
 */
class Report {

    private static ArrayList<Report> reports = new ArrayList<>();

    private int reportNumber;
    private String location;
    private String description;
    private String reportStatus;
    private String studentName;
    private int PhoneNumber;
    private String Location;
    private String StatusDescription;


    public Report(int reportNumber, String location, String description, String reportStatus) {
        this.reportNumber = reportNumber;
        this.location = location;
        this.description = description;
        this.reportStatus = reportStatus;
    }

    public Report(String location, String studentName, int PhoneNumber, String StatusDescription) {
        this.location = location;
        this.description = description;
        this.studentName = studentName;
        this.PhoneNumber = PhoneNumber;
        this.StatusDescription = StatusDescription;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getStatusDescription() {
        return StatusDescription;
    }

    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    
    

   
    /**
     * @return the reportNumber
     */
    public int getReportNumber() {
        return reportNumber;
    }

    /**
     * @param reportNumber the reportNumber to set
     */
    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the reportStatus
     */
    public String getReportStatus() {
        return reportStatus;
    }

    /**
     * @param reportStatus the reportStatus to set
     */
    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * @return the reports
     */
    public static ArrayList<Report> getReports() {
        return reports;
    }

    /**
     * @param report the report to add
     */
    public static void addReport(Report report) {
        reports.add(report);
    }

    public static void AddReport(String studentInfo) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("studentName: " +studentInfo );
        String studentName = input.next();
        System.out.print("Phone number: " + studentInfo);
        int PhoneNumber = input.nextInt();
        System.out.print("Location: " + studentInfo);
        String Location = input.next();
        System.out.print("Status Description: " + studentInfo);
        String StatusDescription = input.next();

        System.out.println("\nReport has been added.");
       
    }

    static void AddReport() {
        Report Info = new Report(213, "124F", "PANIC ATTACK", " new ");
        reports.add(Info);
    }
}