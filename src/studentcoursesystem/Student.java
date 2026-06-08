/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentcoursesystem;

/**
 *
 * @author Sadana
 */
public class Student {
    private int stuID;
    private String stuName;
    private int stuAge;
    private boolean isRegistered;
    
    //Parameterized
    public Student(int stuID, String stuName, int stuAge, boolean isRegistered){
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.isRegistered = isRegistered;
    }
    
    //Non-Parameterized
    public Student(){
        this.stuID = 0;
        this.stuName = "Unknown";
        this.stuAge = 0;
        this.isRegistered = false;
    }
    
    public void displayStudentDetails(){
        String registrationStatus;
        
        System.out.println("Student ID: " + stuID);
        System.out.println("Student Name: " + stuName);
        System.out.println("Student Age: " + stuAge);
        
        if (isRegistered == true) {
            registrationStatus = "Registered";
        }else{
            registrationStatus = "Unregistered";
        }
        
        System.out.println("Registration Status: " + registrationStatus);
        System.out.println("");
    }
}

