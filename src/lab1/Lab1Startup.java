/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jrankin2
 */
public class Lab1Startup {
    public static void main ( String[] args){
        new Lab1Startup();
    }
    
    public Lab1Startup(){
        Course courses[] = {new IntroJavaCourse("Introduction to Java", "802-111"),
            new IntroToProgrammingCourse("Introduction to Programming", "802-112"),
            new AdvancedJavaCourse("Advanced Java", "802-113")
        };
        
        courses[0].setPrerequisites("Some Prerequisite");
        courses[2].setPrerequisites("Introduction to Java");
        
        courses[0].setCredits(4);
        courses[1].setCredits(3);
        courses[2].setCredits(4);
        
        System.out.println("");
        for(Course x : courses){
            System.out.println("---Course---");
            System.out.println("Name: " + x.getCourseName());
            System.out.println("Course Number: " + x.getCourseNumber());
            System.out.println("Prerequisites: " + x.getPrerequisites());
            System.out.println("Credits: " + x.getCredits() + "\n");
        }
        
    }
}
