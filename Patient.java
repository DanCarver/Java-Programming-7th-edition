package blooddata;

/**
 *
 * @author dan carver
 * @since 24/08/2016
 * A program for blood data and patients
 */
public class Patient {
    //data fields
    private int idNum;
    private int age;
    private BloodData  bloodData;
    
    //default constructor
    Patient(){
        idNum = 0;
        age = 0;
        //using composition
        bloodData = new BloodData();
    }
    
    //custopm constructor
    Patient(int num, int pAge, String bloodType, String rhFactor){
        idNum = num;
        age = pAge;
        //composition again
        bloodData = new BloodData(bloodType, rhFactor);
    }
    //getters and setters
    public int getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }
    
    //override annotation and toString method to print data
    @Override
    public String toString(){
        return "your id number is " + idNum + ", your age is " + age + ", and your"
                + " blood type is " + bloodData;
    }
}
