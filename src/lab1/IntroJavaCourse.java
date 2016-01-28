package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
import javax.swing.JOptionPane;
public class IntroJavaCourse extends Course{
private String prerequisites;

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null, "Error :prerequisites cannot be null or empty string");
            System.exit(0);
        }
    }

    




    


   

}
