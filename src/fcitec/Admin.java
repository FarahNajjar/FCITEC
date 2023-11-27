package fcitec;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aisha
 */
public class Admin extends User {

    public Admin(String AdminName, String PhoneNum, int ID) {
        super(AdminName, PhoneNum, ID);
    }
    
       // Method to change the status of a report based on user input
    public static void changeStatus(ArrayList<Report> reports, int reportNumber, int buttonChoice) {
        // Step 1: Search for the report by report number
        Report reportToChange = Report.searchByReportID(reports, reportNumber);

        // Step 2: Check if the report was found
        if (reportToChange != null) {
            // Step 3: Display current status
            System.out.println("Current Status: " + reportToChange.getStatus());

            // Step 4: Update the status based on the user's button choice
            switch (buttonChoice) {
                case 1:
                    reportToChange.setStatus("processing");
                    System.out.println("Status updated to 'processing' successfully.");
                    break;
                case 2:
                    reportToChange.setStatus("solved");
                    System.out.println("Status updated to 'solved' successfully.");
                    break;
                default:
                    System.out.println("Invalid button choice. Status not updated.");
            }
        } else {
            System.out.println("Report not found.");
        }
    }
}
