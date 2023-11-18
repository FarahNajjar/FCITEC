/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project251;

/**
 *
 * @author ASUS
 */
public class Reports {
    // Attributes
    private int reportNumber;
    private String location;
    private String description;
    private String reportType;
    private int studentID;
    private String reportStatus;

    // Constructor
    public Reports(int reportNumber, String location, String description, String reportType, int studentID, String reportStatus) {
        this.reportNumber = reportNumber;
        this.location = location;
        this.description = description;
        this.reportType = reportType;
        this.studentID = studentID;
        this.reportStatus = reportStatus;
    }

    // Getters and Setters

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

 
    //request Report Info methode 
    public void requestReportInfo() {
        // Implementation to request report information from the database
    }
    
    //display Report Info methode 
    public void displayReportInfo() {
       
        System.out.println("Report Number: " + reportNumber);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println("Report Type: " + reportType);
        System.out.println("Student ID: " + studentID);
        System.out.println("Report Status: " + reportStatus);
    }
    
    //update DB methode 
    public void updateDB() {
        // Implementation to update report information in the database
    }
    
    //delete Report methode 
    public void deleteReport() {
        // Implementation to delete the report from the database
    }
    
    //add Report methode 
    public void addReport() {
        // Implementation to add a new report to the database
    }
}
