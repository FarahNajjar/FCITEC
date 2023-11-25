/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;


public class Admin {
  private String eamil;

    public Admin(String eamil) {
        super();
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
    
    
    
    
   public static void DisplayAllAdminReports(){
       
   }
      // Method to change the status of a report based on user input
    public static void changeStatus(Reports[] reports, int reportNumber, int buttonChoice) {
        // Step 1: Search for the report by report number
        Reports reportToChange = searchByReportNumber(reports, reportNumber);

        // Step 2: Check if the report was found
        if (reportToChange != null) {
            // Step 3: Display current status
            System.out.println("Current Status: " + reportToChange.getReportStatus());

            // Step 4: Update the status based on the user's button choice
            switch (buttonChoice) {
                case 1:
                    reportToChange.setReportStatus("processing");
                    System.out.println("Status updated to 'processing' successfully.");
                    break;
                case 2:
                    reportToChange.setReportStatus("finished");
                    System.out.println("Status updated to 'finished' successfully.");
                    break;
                default:
                    System.out.println("Invalid button choice. Status not updated.");
            }
        } else {
            System.out.println("Report not found.");
        }
    }



   // Method to search for a report by report number
    public static Reports searchByReportNumber(Reports[] reports, int reportNumber) {
        for (Reports report : reports) {
            if (report.getReportNumber() == reportNumber) {
                return report;
            }
        }
        return null; // Report not found
    }


  
   public static void UpdateStatus(Reports[] reports, Reports updatedReport){
       
   }

    
    
    
}
