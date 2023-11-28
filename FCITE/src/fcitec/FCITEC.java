package fcitec;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FARAH
 */
public class FCITEC {

    //create a scanner
    public static Scanner in = new Scanner(System.in);
    static FileWriter myWriter = null;

    //create a user object to 
    static User userInfo;
    static ArrayList<Report> reports = new ArrayList<>();

    public static void main(String[] args) {

        //initialize choice
        String choice = null;

        // ask user to log in by phone number,name, and ID
        User.userInfo();
        //print menu based on ID(if student or admin)
        start(userInfo.getId());

        do {
            choice = in.next().toUpperCase();
            switch (choice) {
                case "A":
                    Report.ReportInfo(userInfo);
                    break;
                case "V":
                    Report.displayReports(userInfo.getId());
                    break;
                case "D":
                    System.out.print("Please enter the report number: ");
                    int reportNum = in.nextInt();
                    Report.deleteReport(reportNum);
                    break;
                case "S": 
                    System.out.print("Please enter the report number: ");
                    reportNum = in.nextInt();
                    Report.changeStatus(reportNum);
                    break;
                case "E":
                    System.out.println("Thank you for using the system, have a good day!");
                    System.exit(0);
                    break;
                case "L":
                    User.userInfo();
                    break;
            }
            start(userInfo.getId());
        } while (true);
    }

    //method to check if user is an admin or a student
    public static boolean isAdmin(int ID) {

        String IDString = String.valueOf(ID);

        // if the ID starts with 9, then it's an admin
        if (IDString.startsWith("9")) {
            return true;
        } else {
            return false;
        }
    }

    public static void start(int ID) {
        isAdmin(ID);
        if (isAdmin(ID) == true) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-FCIT Emergency Center(Admin)=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("What would you like to do?");
            System.out.println("V: view reports \nS: change a report's status \nE: exit\nL: log out");

            //if student:
        } else if (isAdmin(ID) == false) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-FCIT Emergency Center(Student)=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("What would you like to do?");
            System.out.println("A: Add a new report \nV: view reports \nD: delete a report \nE: exit\nL: log out");
        }
    }
}