/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitec;

import static fcitec.FCITEC.userInfo;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Dell
 */
public class User {

    private String name;
    private String phoneNumber;
    private String id;

    // Constructor
    public User(String name, String phoneNumber, String id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }
    static void userInfo() {
        System.out.print("Enter your name: ");
        String UserName =  FCITEC.in.next();
        System.out.print("Enter your Phone Number: ");
        String PhoneNum = FCITEC.in.next();
        System.out.print("Enter your ID: ");
        String ID = FCITEC.in.next();
        
           //check id
           if (FCITEC.isAdmin(ID)) {
            Admin admin = new Admin(UserName, PhoneNum, ID);
          AddUser(admin, "Admin.txt");
        } else {
            Student student = new Student(UserName, PhoneNum, ID);
          AddUser(student, "Student.txt");
        }
    }
  static void AddUser(User userData, String UserWriter) {
        try {
            userInfo = userData;
            FCITEC.myWriter = new FileWriter(UserWriter);
            FCITEC.myWriter.write(userInfo.toString());
            FCITEC.myWriter.close();
            System.out.println("\nNew user added successfully.");

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
  
    @Override
    public String toString() {
        return "name: " + name + "\nPhone Number: " + phoneNumber + "\nID: " + id;
    }
    
}