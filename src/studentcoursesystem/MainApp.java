/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentcoursesystem;

import java.util.Scanner;
/**
 *
 * @author Sadana
 */
public class MainApp {
    
    static Student[] students = {
        new Student(1, "Jane Doe", 21, true),
        new Student(2, "John Doe", 24, false)
    };

    static Course[] courses = {
        new Course(1, "Software Engineering", 12, 120, "Monday"),
        new Course(2, "Cybersecurity", 12, 80, "Thursday"),
        new Course(3, "Psychology", 18, 100, "Saturday"),
        new Course(4, "Business Management", 12, 200, "Wednesday")
    };
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userOption = "";

        while (!userOption.equals("4")) {

            clearScreen();
            printHeader("STUDENT COURSE SYSTEM\n");

            System.out.println("1. View Students");
            System.out.println("2. View Courses");
            System.out.println("3. Show Weekly Schedule");
            System.out.println("4. Exit");
            System.out.println("\n------------------------------------");
            
            System.out.print("\nSelect option: ");
            userOption = scanner.nextLine();

            if (userOption.equals("1")) {
                displayStudentDetails(scanner);
            }
            else if (userOption.equals("2")) {
                displayCourseDetails(scanner);
            }
            else if (userOption.equals("3")) {
                showWeeklySchedule(scanner);
            }
            else if (!userOption.equals("4")) {
                System.out.println("Invalid input!");
            }
        }     
    }
    
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void printHeader(String title) {
        System.out.println("====================================");
        System.out.println("  " + title);
        System.out.println("====================================");
    }
    
    public static void displayStudentDetails(Scanner scanner){

        clearScreen();
        printHeader("STUDENT LIST");
        System.out.println();

        for (Student s : students){
            s.displayStudentDetails();
        }

        System.out.println("------------------------------------");
        System.out.println("Press ENTER to return to main menu...");
        scanner.nextLine();
    }
    
    public static void displayCourseDetails(Scanner scanner){
        
        clearScreen();
        printHeader("STUDENT LIST");
        System.out.println();
        
        for (Course c : courses){
            c.displayCourseDetails();
        }

        System.out.println("------------------------------------");
        System.out.println("Press ENTER to return to main menu...");
        scanner.nextLine();
    }
    
    public static void showWeeklySchedule(Scanner scanner){
        clearScreen();
        printHeader("WEEKLY SCHEDULE");
        System.out.println();
        
        for (Course c : courses){
            c.showWeeklySchedule();
        }

        System.out.println("------------------------------------");
        System.out.println("Press ENTER to return to main menu...");
        scanner.nextLine();
    }
}
