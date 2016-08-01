package student;

/**
 *
 * @author danca
 * 
 */
public class ShowStudent {
    
    
    public static void main(String[] args) {
        
        Student student = new Student();
        student.setStudentID(3321);
        student.setCreditHours(12);
        student.setPoints();
        student.setGradePointAv();
        student.studentInput();
    }
    
   
    
}
