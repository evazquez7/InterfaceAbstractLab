/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
//I used the open closed principles here in my getters becasue I do not want someone else entering or changing my code. 
//The way I dealt with Concrete Dangers of Inheritance by having my StartUp Class only interacting with the user. 
//I also included validation with but in the setter so before it sets the variable it will decided if it is the correct value. 
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private  double credits;
    private String prerequisites;
    
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public final String getCourseNumber() {
        return courseNumber;
    }
     public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber(String courseNumber);
    
    
    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);  

    public final String getCourseName() {
        return courseName;
    }
    
     public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);

      

    
}
