
package fcitec;

/**
 *
 * @author FARAH
 */

public class FCITEC {

    static int IDCounter = 1;

    public static void main(String[] args) {
        // TODO code application logic here
         Report.AddReport();
         User.displayReports();
         Report.AddReport();
         User.displayReports();

  }
}