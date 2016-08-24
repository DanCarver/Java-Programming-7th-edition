package blooddata;

/**
 *
 * @author dan carver
 * @since 24/08/2016
 * A program for blood data and patients
 */
public class BloodData {
    //data fields
    private String bloodType;
    private String rhFactor;
    
    //default constructor
    BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    //custom constructor
    BloodData(String type, String factor){
        bloodType = type;
        rhFactor = factor;
    }

    //getters and setters
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    
    //override annotation and toString method to print data
    @Override
    public String toString(){
        
        return "Your blood type is " + bloodType + rhFactor;
    }
    
}
