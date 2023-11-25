package fcitec;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FARAH
 */
public class FCITEC {

    public static void main(String[] args) {

        int choice = 0;

        Scanner in = new Scanner(System.in);

         // header
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-FCIT Emergency Center=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("What would you like to do?");
        System.out.println("1: File a new report \n2: view reports \n3: delete a report \n4: change a report's status(Admin Only) \n5: exit");

        while (choice != 5) {

            choice = in.nextInt();
            switch (choice) {
                case 1:
                    Report.AddReport();
                    break;
                case 2:
                    Report.displayReports(ID);
                    break;
                case 3:
                    Student.DeleteReport();
                    break;
                case 4:
                    System.out.println("please enter your ID: ");
                    int ID = in.nextInt();

                    String userIDString = String.valueOf(ID);
                    if (userIDString.charAt(0) == '0') {
                        System.out.println("Welcome admin" + ID);
                        // change status
                    } else {

                        System.out.println("unauthorized Access, admins only.");
                    }
                    
                    break;
                case 5:
                    System.out.println("Thank you for using the system, have a good day!");
                    System.exit(0);
            }

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-FCIT Emergency Center=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Would you like to make another operation?");
            System.out.println("1: File a new report \n2: view reports \n3: delete a report \n4: change a report's status(Admin Only) \n5: exit");
        }
    }

    // move to 'admin' class
    public static Report searchByReportID(ArrayList<Report> ReportL, int ID) {
        Report report = null;
        for (Report R : ReportL) {
            if (R.getReportNumber() == ID) {
                report = R;
            }
        }
        return report;
    }
}