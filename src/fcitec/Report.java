package fcitec;

import java.util.ArrayList;
import java.util.Scanner;

class Report {

    private static ArrayList<Report> reports = new ArrayList<>();
    private static int IDCounter = 1;

    private int reportNumber;
    private String location;
    private String description;
    private String reportStatus;
    private String studentName;
    private int phoneNumber;
    private String statusDescription;

    public Report(int reportNumber, String location, String description, String reportStatus) {
        this.reportNumber = reportNumber;
        this.location = location;
        this.description = description;
        this.reportStatus = reportStatus;
    }

    public Report(String location, String studentName, int phoneNumber, String statusDescription) {
        this.location = location;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.statusDescription = statusDescription;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

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

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public static ArrayList<Report> getReports() {
        return reports;
    }

    public static void addReport(Report report) {
        reports.add(report);
    }


    public static void AddReport() {
        Scanner input = new Scanner(System.in);

        System.out.print("Student Name: ");
        String studentName = input.next();

        System.out.print("Phone Number: ");
        int phoneNumber = input.nextInt();

        System.out.print("Location: ");
        String location = input.next();

        System.out.print("Status Description: ");
        String statusDescription = input.next();

        Report info = new Report(IDCounter, location, "PANIC ATTACK", "new");
        reports.add(info);

        IDCounter++; // Increment IDCounter

        System.out.println("\nReport has been added.");
    }



    public static void displayReports(int userID) {
        System.out.println("------------------------- Report Details -------------------------");

        String userIDString = String.valueOf(userID);

        if (userIDString.charAt(0) == '0') {
            // Print all reports if the first character of the userIDString is '0' (ADMIN)
            for (Report report : Report.getReports()) {
                System.out.println("Report Number: " + report.getReportNumber()
                        + "\nLocation: " + report.getLocation()
                        + "\nDescription: " + report.getDescription()
                        + "\nReport Status: " + report.getReportStatus());
                System.out.println("\n----------------------------------------------------------------\n");
            }
        } else {
            // Print only the reports corresponding to the provided userID (Student)
            for (Report report : Report.getReports()) {
                if (report.getReportNumber() == userID) {
                    System.out.println("Report Number: " + report.getReportNumber()
                            + "\nLocation: " + report.getLocation()
                            + "\nDescription: " + report.getDescription()
                            + "\nReport Status: " + report.getReportStatus());
                    System.out.println("\n----------------------------------------------------------------\n");
                }
            }
        }


   public static void deleteReport(ArrayList<Report> reports, int reportNumber) {
        boolean found = false;

        for (Report report : reports) {
            if (report.getReportNumber() == reportNumber) {
                reports.remove(report);
                System.out.println("Report with ID " + reportNumber + " has been deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Report with ID " + reportNumber + " not found.");
        }
    }
    


    // Method to delete a report from the array list 
    public static void deleteReport(ArrayList<Report> reoprt,int reportNumber) {
        for (Report R : reports) {
            if (R.getReportNumber() == reportNumber) {
                reoprt.remove(R);
                System.out.println("Report with ID " + reportNumber + " has been deleted.");
            }else {
        System.out.println("Report with ID " + reportNumber  + " not found.");
            } 
        }
    

    }
}
         
    
    
    



