/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import java.io.FileWriter;
import java.io.IOException;
import java.util.jar.Attributes.Name;

/**
 *
 * @author njood
 */
public class AddReport {
    
   static void AddReport(String studentInfo){
     try {
            FileWriter myWriter = new FileWriter("AddReport.txt");
            myWriter.write("name: " + studentInfo
                           + " \n emial address: " + studentInfo
                           + "\n ID: " + studentInfo);
            myWriter.close();
            System.out.println("\nReport has been added.");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
   }
}
    
 
    
    

