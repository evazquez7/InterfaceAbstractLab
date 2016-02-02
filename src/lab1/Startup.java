/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Emilio
 */
import java.util.Scanner;
public class Startup {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//       
//        String courseNumber;
//        String prerequisites;
//        ProgrammingCourse introProgramming = new IntroToProgrammingCourse();
//        ProgrammingCourse introJava = new IntroJavaCourse();
//        ProgrammingCourse advancedJava = new AdvancedJavaCourse();
//        
ProgrammingCourse courses[] = {new IntroToProgrammingCourse(), new IntroJavaCourse(),new AdvancedJavaCourse()};
        
        for (ProgrammingCourse c: courses){
            c.setCredits(3.0);
            System.out.println(c.getCredits());
        }
        
//        System.out.println("Please enter the ProgrammingCourse Number for your Intro to Programming class ");
//        courseNumber = keyboard.nextLine();
//        introProgramming.setCourseNumber(courseNumber);
//        System.out.println("For Intro to Programming you are taking: " + introProgramming.getCredits());
//        keyboard.nextLine();
//        System.out.println("Please enter th15478e course number for Intro Java: ");
//        courseNumber = keyboard.nextLine();
//        introJava.setCourseNumber(courseNumber);
//        System.out.println("Your course number for Intro Java is: " + introJava.getCourseNumber());
//        System.out.println("Please enter any prerequisites for Advanced Java: ");
//        prerequisites = keyboard.nextLine();
//        advancedJava.setPrerequisites(prerequisites);
//        System.out.println("The prerequisites for the class are : " + advancedJava.getPrerequisites());
        
        /*
        This is a very good method of writing code because you do not spend a lot of time rewriting all the code in the sub-classes if you have it in a 
        SuperClass. This is beneficial as well because you are able to create instances of those objects with ease. 
        */
    }
}
