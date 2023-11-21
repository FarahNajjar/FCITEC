/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    public Report(int reportNumber, String location, String description, String reportStatus) {
        this.reportNumber = reportNumber;
        this.location = location;
        this.description = description;
        this.reportStatus = reportStatus;
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

    static void AddReport(String studentInfo) {
        try {
            FileWriter myWriter = new FileWriter("AddReport.txt");
            myWriter.write("name: " + studentInfo
                    + " \n emial address: " + studentInfo
                    + "\n ID: " + studentInfo);
            myWriter.close();
            System.out.println("\nReport has been added.");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
     static void AddReport() {
            Report Info = new Report(213, "124F", "PANIC ATTACK", " new ");
            reports.add(Info); 
    }
}
