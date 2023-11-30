package fcitec;

import static fcitec.FCITEC.isAdmin;
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
 //
    public Report() {
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

    public static ArrayList<Report> getReports() {
        return reports;
    }

    public static void setReports(ArrayList<Report> reports) {
        Report.reports = reports;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void displayReports(String userID) {
        System.out.println("------------------------- Report Details -------------------------");
        // calling check isAdmin method
        if (isAdmin(userID)) {
            // Print all reports if the first character of the userIDString is '9' (ADMIN)
            for (int i = 0; i < reports.size(); i++) {
                Report loopReport = reports.get(i);
                System.out.println(loopReport.toString());
            }
        } else {
            for (int i = 0; i < reports.size(); i++) {
                Report loopReport = reports.get(i);
                if (loopReport.getUser().getId().equals(userID)) {
                    System.out.println(loopReport.toString());
                }
            }
        }
    }

    public static Report searchByReportNumber(int ReportNumber) {
        for (Report report : reports) {
            if (report.getReportNumber()== ReportNumber) {
                return report;
            }
        }
        return null;
    }

    //delete report by report number 
    public static void deleteReport(int reportNumberToDelete) {
        Report reportToDelete = searchByReportNumber(reportNumberToDelete);
        if (reportToDelete != null) {
            reports.remove(reportToDelete);
            WriteReport(); // Update the file after removing the report
            System.out.println("Report deleted successfully.");
        } else if ("Resolved".equals(reportToDelete.getStatus())) {
            System.out.println("This report is Resolved");

        } else {
            System.out.println("Report not found.");
        }
    }

    //change status by admin
    public static void changeStatus(int reportNumberToChange) {

        // Search for the report based on the user input report number
        Report reportToChangeStatus = searchByReportNumber(reportNumberToChange);

        //if the report was found
        if (reportToChangeStatus != null) {

            System.out.println("Choose a new status for the report:");
            System.out.println("1. Processing");
            System.out.println("2. Resolved");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    reportToChangeStatus.setStatus("Processing");
                    System.out.println("Report status updated to Processing.");
                    break;
                case 2:
                    reportToChangeStatus.setStatus("Resolved");
                    System.out.println("Report status updated to Resolved.");
                    break;
                default:
                    System.out.println("Invalid choice. No changes made to the report status.");
            }
            WriteReport();
        } else {//if the report was not found
            System.out.println("Report not found.");
        }
    }

    public static void addInfo(User user) {
        Scanner input = new Scanner(System.in);

        System.out.print("Location: ");
        String location = input.next();
        System.out.print("Description: ");
        String description = input.next();

        Report info = new Report(IDCounter, location, description, user, "new");
        reports.add(info);
        WriteReport();
        IDCounter++; // Increment IDCounter

        System.out.println(info.toString());

        System.out.println("\nReport has been added.");
    }

   public static void WriteReport() {
        try {
            FCITEC.myWriter = new FileWriter("Reports.txt");
            for (int i = 0; i < reports.size(); i++) {
                Report report = reports.get(i);

                FCITEC.myWriter.write(report.toString());
                FCITEC.myWriter.write("\n----------------------------------------------------------------\n");
            }
            FCITEC.myWriter.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "\nReport Number: " + ReportNumber + "\nName: " + user.getName()
                + "\nPhone Number: " + user.getPhoneNumber() + "\nID: " + user.getId()
                + "\nLocation: " + Location + "\nDescription: " + Description + "\nReport Status: " + Status;
    }
}