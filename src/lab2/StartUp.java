/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class StartUp {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double credits;
        String courseNumber;
        String prerequisites;
        Course2 introProgramming = new IntroToProgrammingCourse() {}; 
        Course2 introJava = new IntroJavaCourse();
        Course2 advancedJava = new AdvancedJavaCourse();
        
        System.out.println("Please enter the amount of credits your Intro to Programming class has: ");
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
     }
     
     /*
     The bad thing about using an interface in this lab is that it is more time consuming and uses a lot more code than lab one because  you need to override 
     each method in every sub-class making it kind of pointless instead of just having a abstract superclass. 
     
     
     I believe that the best time to use the Liskov Substitution principle is when you are trying to encapsulate.  
     The time we would not use it when we have to call a concrete superclass. 
     */
     
}
