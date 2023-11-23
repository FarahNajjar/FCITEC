
package fcitec;

import java.util.ArrayList;

/**
 *
 * @author FARAH
 */
public class FCITEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Report.AddReport();
        User.displayReports();


        //call method delete 
         ArrayList<Report> reportList = new ArrayList<>();
         Report.deleteReport(reportList,213);
}

}
