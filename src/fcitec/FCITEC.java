package fcitec;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FARAH
 */
public class FCITEC {

    public static Scanner in = new Scanner(System.in);
    static FileWriter myWriter = null;

    static User userInfo;
    static ArrayList<Report> reports = new ArrayList<>();

    public static void main(String[] args) {

        String choice = null;

        User.userInfo();
        start(userInfo.getId());
        
        do {
            choice = in.next();
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
                case "S": // change status

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

    public static boolean isAdmin(int ID) {

        String IDString = String.valueOf(ID);

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
