/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author njood
 */
public class Report {
    
   static void AddReport(String studentInfo){
     try {
            FileWriter myWriter = new FileWriter("AddReport.txt");
            myWriter.write("name: " + studentInfo
                           + " \n phone number: " + studentInfo
                           + " \n Location: " + studentInfo
                           + "\n Status description: " + studentInfo);
            myWriter.close();
            System.out.println("\nReport has been added.");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
   }
}
    
 
    
    

