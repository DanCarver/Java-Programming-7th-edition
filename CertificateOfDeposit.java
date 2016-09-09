package certificateofdeposit;

import java.util.*;

/**
 *
 * @author dan carver
 * @since 2016/09/04
 * A program for users to input their certificate number, surname, and balance. It calculates maturity date as well
 */

public class CertificateOfDeposit {
    //data fields
    private int certNum;
    private String lastName;
    private double bal;
    //calendar objects and composition
    private Calendar issueDate;
    private Calendar maturityDate;
    CertificateOfDeposit newCertificate;
    
    //constructor
    public CertificateOfDeposit(int certificateNum, String name, double balance, int year, int month, int date){
        certNum = certificateNum;
        lastName = name;
        bal = balance;
        
        issueDate = new GregorianCalendar(2016, 9, 8);
    }
    //constructor
    public CertificateOfDeposit(){

    }
    
    //getters and setters
    public int getCertNum() {
        return certNum;
    }

    public void setCertNum(int certNum) {
        this.certNum = certNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public Calendar getIssueDate() {
        return issueDate;
    }

    public void setIssueDate() {
        int year = issueDate.get(Calendar.YEAR);
        int month = issueDate.get(Calendar.MONTH);
        int day = issueDate.get(Calendar.DAY_OF_MONTH);
        
        this.issueDate = issueDate;
    }

    public Calendar getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate() {
        this.maturityDate = maturityDate;
    }
    
    //method to add a year onto maturity date
    public Calendar calculateMaturityDate(){
        setIssueDate();
        maturityDate.add(Calendar.YEAR, 1);
        
        return maturityDate;
    }
    
    //method to get input from user
    public CertificateOfDeposit createCertificate(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter certificate number");
        certNum = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Enter last name");
        lastName = input.nextLine();
        
        System.out.println("Enter account balance");
        bal = input.nextDouble();
        
        return newCertificate;
    }
    
    //tostring method with override annotation to display a string for output
    @Override
    public String toString(){
        
        return "The certificate number " + certNum + " which belongs to " + lastName
                + ", and has the balance $" + bal + " was issued on " + issueDate
                + ", and has a maturity date of " + maturityDate;
    }
    
}
