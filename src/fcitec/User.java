/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fcitec;

/**
 *
 * @author Dell
 */import java.util.ArrayList;

public class User {
    private String name;
    private String phoneNumber;
    private int id;

    // Constructor
    public User(String name, String phoneNumber, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public static void displayReports() {
        System.out.println("------------------------- Report Details -------------------------");
        boolean isAdmin = false;

        // Check if the requester is an admin
//        if (requesterID.equals("ADMIN")) {
//            isAdmin = true;
//        }

     //   if (isAdmin) {
            // Display all reports if the requester is an admin
            for (Report report : Report.getReports()) {
             //   System.out.println(report.toString());
                System.out.println("Report Number: " + report.getReportNumber() +
                        "\nLocation: " + report.getLocation() +
                        "\nDescription: " + report.getDescription() +
                        "\nReport Status: " + report.getReportStatus());
                System.out.println("\n----------------------------------------------------------------\n");
            }
      //  } 
//        else {
//            // Display only the report of the student with the provided ID
////            for (Report report : Report.getReports()) {
////                if (report.getStudentID().equalsIgnoreCase(requesterID)) {
////                    System.out.println(report.toString());
////                    break; // Assuming there's only one report per student, exit the loop after finding the matching report
////                }
////            }
//        }
    }
}

