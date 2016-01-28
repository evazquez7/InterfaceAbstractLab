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
        Scanner keyboard = new Scanner(System.in);
        double credits;
        String courseNumber;
        String prerequisites;
        Course introProgramming = new IntroToProgrammingCourse();
        Course introJava = new IntroJavaCourse();
        Course advancedJava = new AdvancedJavaCourse();
        
        System.out.println("Please enter the amount of credits your Intro to Programming class is. ");
        credits = keyboard.nextDouble();
        introProgramming.setCredits(credits);
        System.out.println("For Intro to Programming you are taking: " + introProgramming.getCredits());
        keyboard.nextLine();
        System.out.println("Please enter the course number for Intro Java: ");
        courseNumber = keyboard.nextLine();
        introJava.setCourseNumber(courseNumber);
        System.out.println("Your course number for Intro Java is: " + introJava.getCourseNumber());
        System.out.println("Please enter any prerequisites for Advanced Java: ");
        prerequisites = keyboard.nextLine();
        advancedJava.setPrerequisites(prerequisites);
        System.out.println("The prerequisites for the class are : " + advancedJava.getPrerequisites());
        
        /*
        This is a very good method of writing code because you do not spend a lot of time rewriting all the code in the sub-classes if you have it in a 
        SuperClass. This is beneficial as well because you are able to create instances of those objects with ease. 
        */
    }
}
