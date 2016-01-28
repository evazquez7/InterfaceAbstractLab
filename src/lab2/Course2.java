/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Emilio
 */
public interface Course2 {
    public abstract void setCourseName(String courseName);
    public String getCourseName();
    public void setCredits(double credits);
    public double getCredits();
    public abstract void setCourseNumber(String courseNumber);
    public String getCourseNumber();
    public void setPrerequisites(String prerequisites);
    public String getPrerequisites();
}
