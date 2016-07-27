package student;

/**
 *
 * @author danca
 */
import java.util.Scanner;
public class Student {
    //data fields
    private int studentID;
    private double creditHours;
    private double points;
    private final double SCALE = 4;
    private double gradePointAv;
    Student newStudent;

    //getter and setter methods
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getGradePointAv() {
        return gradePointAv;
    }

    public void setGradePointAv(double gradePointAv) {
        gradePointAv = (points / creditHours);
        
        this.gradePointAv = gradePointAv;
    }
    
    //method to prompt for student data
    public Student studentInput(){
    //scanner object
    Scanner input = new Scanner(System.in);
    
    //input prompts
    System.out.println("Enter student ID");
    studentID = input.nextInt();
    System.out.println("Enter credit hours");
    creditHours = input.nextDouble();
    points = (creditHours * SCALE);
        
    newStudent = new Student();
    newStudent.setStudentID(studentID);
    newStudent.setCreditHours(creditHours);
    newStudent.setPoints(points);
    
    return newStudent;
    }
    
    //method to calculate GPA
    public void calculateGPA(){
        gradePointAv = points / creditHours;
        
        
    }

    //toString method to return the data to the object
    public String toString(){
     
        return "Your student ID is \n" + studentID + "\n your credit hours earned "
                + "are \n" + creditHours + "\n your points earned are \n" + points
                + "\n and your GPA is \n" + gradePointAv + ".";
    }
    
}
