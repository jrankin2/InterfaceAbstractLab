/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author jrankin2
 */
public class Course {
    protected String courseName;
    protected String courseNumber;
    protected double credits;
    protected String prerequisites;

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getCourseName() {
        return courseName;
    }
    
    public double getCredits(){
        return credits;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getPrerequisites() {
        if(prerequisites == null || prerequisites.length() == 0){
            return "No Prerequisites";//maybe null?
        }
        return prerequisites;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null, 
                    "Error: courseNumber cannot be null or empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null, "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            //throw exception || set to null?
            JOptionPane.showMessageDialog(null, "Error: prerequisites cannot be null or empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
}
