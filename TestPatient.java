package blooddata;

/**
 *
 * @author dan carver
 * @since 24/08/2016
 * A program for blood data and patients
 */
public class TestPatient {
    
    public static void main(String[] args){
        //patient objects display data from both constructors
        Patient patient1 = new Patient();
        Patient patient2 = new Patient(105, 22, "AB", "+");
        
        //printing data
        System.out.println(patient1.toString());
        System.out.println("");
        System.out.println(patient2.toString());
    }
    
}
