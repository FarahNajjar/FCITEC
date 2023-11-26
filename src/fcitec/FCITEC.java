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

    static ArrayList<Report> reports = new ArrayList<>();

    public static void main(String[] args) {

        String choice = null;

        System.out.print("please enter your ID: ");
        int ID = in.nextInt();

        start(ID);
        choice = in.next();

        do {
            
        
            switch (choice) {
                case "A":
                    Report.AddReport();
                    break;
                case "V":

                    Report.displayReports(ID);
                    break;
                case "D":
                    System.out.print("Please enter the report number: ");
                    int reportNum = in.nextInt();
                    Report.deleteReport(reports, reportNum);
                    break;
                case "S": // change status

                    break;
                case "E":
                    System.out.println("Thank you for using the system, have a good day!");
                    System.exit(0);
            }
            start(ID);
            choice = in.next();
    } while (true);
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

//    public static void USER(Scanner input, ArrayList AddCustomer) {
//        System.out.print("Enter your First name: ");
//        String CustomerFirstName = input.next();
//        System.out.print("Enter your last name: ");
//        String CustomerLastName = input.next();
//        System.out.print("Enter your PhoneNumber: ");
//        String CustomerPhoneNumber = input.next();
//        System.out.print("Enter your Email: ");
//        String CustomerEmail = input.next();
//        System.out.print("Enter your location: ");
//        String CustomerLocation = input.next();
//        Customer customer = new Customer(CustomerFirstName, CustomerLastName, CustomerPhoneNumber, CustomerEmail, CustomerLocation);
//        customer.AddCustomer(AddCustomer, customer);
//        System.out.println(customer.showMenu(AddStore));
//        placeOrder(input, customer);
//        System.out.println();
//    }
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
            System.out.println("V: view reports \nS: change a report's status \nE: exit");

            //if student:
        } else if (isAdmin(ID) == false) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-FCIT Emergency Center(Student)=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("What would you like to do?");
            System.out.println("A: Add a new report \nV: view reports \nD: delete a report \nE: exit");
        }
    }
}