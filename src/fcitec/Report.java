package fcitec;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Report {

    private static ArrayList<Report> reports = new ArrayList<>();
    private static int IDCounter = 1;

    private int ReportNumber;
    private String Location;
    private String Description;
    private String Status;
    private User user;

    public Report(int ReportNumber, String Location, String Description, User user, String Status) {
        this.ReportNumber = ReportNumber;
        this.Location = Location;
        this.Description = Description;
        this.user = user;
        this.Status = Status;
    }

    public static int getIDCounter() {
        return IDCounter;
    }

    public static void setIDCounter(int IDCounter) {
        Report.IDCounter = IDCounter;
    }

    public int getReportNumber() {
        return ReportNumber;
    }

    public void setReportNumber(int ReportNumber) {
        this.ReportNumber = ReportNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void ReportInfo(User user) {
        Scanner input = new Scanner(System.in);

        System.out.print("Location: ");
        String location = input.next();
        System.out.print("Description: ");
        String description = input.next();

        Report info = new Report(IDCounter, location, description, user, "new");
        reports.add(info);
        AddReport(info);

        IDCounter++; // Increment IDCounter

        System.out.println("\nReport has been added.");
    }

   private static void AddReport(Report report) {
        try {
            FCITEC.myWriter = new FileWriter("Reports.txt");

            String UserInfo = "Name: " + report.getUser().getName()
                    + "\nPhone Number: " + report.getUser().getPhoneNumber()
                    + "\nID: " + report.getUser().getId()
                    + "\nReport Number: " + report.getReportNumber()
                    + "\nLocation: " + report.getLocation()
                    + "\nDescription: " + report.getDescription()
                    + "\nReport Status: " + report.getStatus();

            FCITEC.myWriter.write(UserInfo);
            FCITEC.myWriter.write("\n----------------------------------------------------------------\n");
            System.out.println(UserInfo);

            FCITEC.myWriter.close();
            System.out.println("\nNew report added successfully.");

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static void displayReports(int userID) {
        System.out.println("------------------------- Report Details -------------------------");
        String userIDString = String.valueOf(userID);
        // calling check isAdmin method
        if (userIDString.charAt(0) == '9') {        // Print all reports if the first character of the userIDString is '9' (ADMIN)
            for (int i = 0; i < reports.size(); i++) {
                Report loopReport = reports.get(i);
                printReportDetails(loopReport);
            }
        } else {
            for (int i = 0; i < reports.size(); i++) {
                Report loopReport = reports.get(i);
                if (loopReport.getUser().getId() == userID) {
                    printReportDetails(loopReport);
                }
            }
        }
    }

    private static void printReportDetails(Report loopReport) {
        System.out.println("name: " + loopReport.getUser().getName()
                + "\nPhone Number: " + loopReport.getUser().getPhoneNumber() + "\nID: " + loopReport.getUser().getId() + "Report Number: " + loopReport.getReportNumber()
                + "\nLocation: " + loopReport.getLocation() + "\nDescription: " + loopReport.getDescription()
                + "\nReport Status: " + loopReport.getStatus());
        System.out.println("\n----------------------------------------------------------------\n");
    }
}
