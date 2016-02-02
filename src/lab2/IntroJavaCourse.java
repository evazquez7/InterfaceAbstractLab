package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Course2 {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

 
    
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    @Override
    public double getCredits() {
        return credits;
    }
    @Override
    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }
    
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

   


    
}
