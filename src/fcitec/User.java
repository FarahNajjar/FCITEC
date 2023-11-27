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
 * @author Dell
 */
import java.util.ArrayList;

public class User {

    private String name;
    private String phoneNumber;
    private int id;

    // Constructor
    public User(String name, String phoneNumber, int id) {
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

    public void setId(int id) {
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    static void WriteInfo(User userInfo, String UserWriter) {
        try {

            FCITEC.myWriter = new FileWriter(UserWriter);
            FCITEC.myWriter.write("name: " + userInfo.getName()
                              +"\nPhone Number: " + userInfo.getPhoneNumber()
                              +"\nID: " + userInfo.getId());
            FCITEC.myWriter.close();
            System.out.println("\nSuccessfully wrote to the file.");

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    static void UserInfo() {
        System.out.print("Enter your name: ");
        String UserName = FCITEC.in.nextLine();
        System.out.print("Enter your Phone Number: ");
        String PhoneNum = FCITEC.in.next();
        System.out.print("Enter your ID: ");
        int ID = FCITEC.in.nextInt();
        
        String str = String.format("%d", ID);
        if (str.charAt(0) == '0') {
            Admin admin = new Admin(UserName, PhoneNum, ID);
            Admin.WriteInfo(admin, "Admin.txt");
        } else {
            Student student = new Student(UserName, PhoneNum, ID);
            Student.WriteInfo(student, "Student.txt");
        }
    }
}