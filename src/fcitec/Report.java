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
        AddReport();
        IDCounter++; // Increment IDCounter

        System.out.println("\nReport Number: " + info.getReportNumber()
                + "\nName: " + info.getUser().getName()
                + "\nPhone Number: " + info.getUser().getPhoneNumber()
                + "\nID: " + info.getUser().getId()
                + "\nLocation: " + info.getLocation()
                + "\nDescription: " + info.getDescription()
                + "\nReport Status: " + info.getStatus());

        System.out.println("\nReport has been added.");
    }

    private static void AddReport() {
        try {
            FCITEC.myWriter = new FileWriter("Reports.txt");
            for (int i = 0; i < reports.size(); i++) {
                Report report = reports.get(i);

                String UserInfo = "Report Number: " + report.getReportNumber()
                        + "\nName: " + report.getUser().getName()
                        + "\nPhone Number: " + report.getUser().getPhoneNumber()
                        + "\nID: " + report.getUser().getId()
                        + "\nLocation: " + report.getLocation()
                        + "\nDescription: " + report.getDescription()
                        + "\nReport Status: " + report.getStatus();

                FCITEC.myWriter.write(UserInfo);
                FCITEC.myWriter.write("\n----------------------------------------------------------------\n");
            }

            FCITEC.myWriter.close();

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
                + "\nPhone Number: " + loopReport.getUser().getPhoneNumber() + "\nID: " + loopReport.getUser().getId() + "\nReport Number: " + loopReport.getReportNumber()
                + "\nLocation: " + loopReport.getLocation() + "\nDescription: " + loopReport.getDescription()
                + "\nReport Status: " + loopReport.getStatus());
        System.out.println("\n----------------------------------------------------------------\n");
    }

    public static Report searchByReportID(ArrayList<Report> ReportL, int ID) {
        Report report = null;
        for (Report R : ReportL) {
            if (R.getReportNumber() == ID) {
                report = R;
            }
        }
        return report;

    }

    ///delete 
    public static void deleteReport(int reportNumberToDelete) {
        Report reportToDelete = searchByReportID(reports, reportNumberToDelete);
        if (reportToDelete != null) {
            reports.remove(reportToDelete);
            updateFile(); // Update the file after removing the report
            System.out.println("Report deleted successfully.");
        } else {
            System.out.println("Report not found.");
        }
    }

    private static void updateFile() {
        try {
            FileWriter myWriter = new FileWriter("Reports.txt");

            myWriter.write(" report successfully deleted .");
            myWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //change status by admin
    public static void changeStatus(ArrayList<Report> reports) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the report number to change status: ");
        int reportNumberToChange = input.nextInt();

        // Search for the report based on the user input report number
        Report reportToChangeStatus = searchByReportID(reports, reportNumberToChange);
        //if the report was found
        if (reportToChangeStatus != null) {

            System.out.println("Choose a new status for the report:");
            System.out.println("1. Processing");
            System.out.println("2. Resolved");

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
            updateFileStatus(reports); // Update the file after changing the report status
        } else {//if the report was not found
            System.out.println("Report not found.");
        }
    }

    private static void updateFileStatus(ArrayList<Report> reports) {
        try {
            FileWriter myWriter = new FileWriter("Reports.txt");

            // Iterate through the list of reports and update only the status in the file
            for (Report report : reports) {
                String updatedStatusInfo = "Report Number: " + report.getReportNumber()
                        + "\nReport Status to: " + report.getStatus();

                myWriter.write(updatedStatusInfo);
                myWriter.write("\n----------------------------------------------------------------\n");
            }
            //Report Number: 111 - Status updated to: Processing
            //Report Number: 222 - Status updated to: Resolved

            myWriter.close();
            System.out.println("\nReport status updated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
