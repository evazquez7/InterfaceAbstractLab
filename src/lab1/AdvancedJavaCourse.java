package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
  //String courseName;
//    private String courseNumber;
//    private double credits;
   private String prerequisites;

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null, "Error :prerequisites cannot be null or empty string");
            System.exit(0);
        }
    }

   

    
}
