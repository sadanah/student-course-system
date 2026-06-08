/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentcoursesystem;

/**
 *
 * @author Sadana
 */
public class Course {
    private int courseID;
    private String courseName;
    private int courseDuration;    
    private int courseCapacity;
    private String courseSchedule;
    
    //Parameterized
    public Course(int courseID, String courseName, int courseDuration, int courseCapacity, String courseSchedule){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseCapacity = courseCapacity;
        this.courseSchedule = courseSchedule;
    }
    
    //Non-parameterized
    public Course(){
        courseID = 0;
        courseName = "Unknown";
        courseDuration = 0;
        courseCapacity = 0;
        courseSchedule = "Unknown";
    }
    
    public void displayCourseDetails(){
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " months");
        System.out.println("Course Capacity: " + courseCapacity);
        System.out.println("Course Schedule " + courseSchedule);
        System.out.println(" ");
    }
    
    public void showWeeklySchedule(){
        System.out.println(courseSchedule + " - " + courseName);
    }
}
