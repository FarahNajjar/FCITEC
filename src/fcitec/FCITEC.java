package fcitec;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FARAH
 */
public class FCITEC {
       public static  Scanner in = new Scanner(System.in);
    static FileWriter myWriter = null;

    public static void main(String[] args) {

        int choice = 0;

        // header
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-FCIT Emergency Center=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("What would you like to do?");
        System.out.println("1: File a new report \n2: view reports \n3: delete a report \n4: change a report's status(Admin Only) \n5: exit");

        while (choice != 5) {

            // read user choice
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    Report.AddReport();
                    break;
                case 2:
                    System.out.println("please enter your ID: ");
                    int ID = in.nextInt();
                    Report.displayReports(ID);
                    break;
                case 3:
                    Student.DeleteReport();
                    break;
                case 4: // change status
                    
                    
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
      public static void USER(Scanner input, ArrayList AddCustomer){
        System.out.print("Enter your First name: ");
        String CustomerFirstName = input.next();
        System.out.print("Enter your last name: ");
        String CustomerLastName = input.next();
        System.out.print("Enter your PhoneNumber: ");
        String CustomerPhoneNumber = input.next();
        System.out.print("Enter your Email: ");
        String CustomerEmail = input.next();
        System.out.print("Enter your location: ");
        String CustomerLocation = input.next();
        Customer customer = new Customer(CustomerFirstName, CustomerLastName, CustomerPhoneNumber, CustomerEmail, CustomerLocation);
        customer.AddCustomer(AddCustomer, customer);
        System.out.println(customer.showMenu(AddStore));
        placeOrder(input,customer);
        System.out.println();
    }
}