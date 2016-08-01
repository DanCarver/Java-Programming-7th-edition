package student;

/**
 *
 * @author danca
 */
public class Student {
    //data fields
    private int studentID;
    private double creditHours;
    private double points;
    private final double SCALE = 4;
    private double gradePointAv;
    Student newStudent;
    
    //constructor
    public Student(){
        
    }
    
    public Student(int studentID, double creditHours, double points){
        this.studentID = 9999;
        this.creditHours = 3;
        this.points = 12;
        
    }



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

    public void setPoints() {
        points = (creditHours * SCALE);
    }

    public double getGradePointAv() {
        return gradePointAv;
    }

    public void setGradePointAv() {
        gradePointAv = (points / creditHours);
        
        this.gradePointAv = gradePointAv;
    }
    
    //method to output student data
    public void studentInput(){
    
    //output messages
    System.out.println("Student ID " + getStudentID());
    System.out.println("Credit hours " + getCreditHours());
    System.out.println("Points " + getPoints());
    System.out.println("GPA " + getGradePointAv());
    
    }
    
}
