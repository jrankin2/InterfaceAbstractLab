/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author jrankin2
 */
public interface Course {

    String getCourseName();

    String getCourseNumber();

    double getCredits();

    String getPrerequisites();

    void setCourseName(String courseName);

    void setCourseNumber(String courseNumber);

    void setCredits(double credits);

    void setPrerequisites(String prerequisites);
    
}
