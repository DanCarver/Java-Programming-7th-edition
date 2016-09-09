package certificateofdeposit;

import java.util.GregorianCalendar;

/**
 *
 * @author dan carver
 * @since 2016/09/04
 * A program for users to input their certificate number, surname, and balance. It calculates maturity date as well
 */
public class TestCertificateOfDeposit {

    
        public static void main(String[] args) {
            //two certificate objects
            CertificateOfDeposit certificate1 = new CertificateOfDeposit(1, "k", 10, 2016, 9, 9);
            CertificateOfDeposit certificate2 = new CertificateOfDeposit();
            
            //using input method for objects
            certificate1.createCertificate();
            certificate2.createCertificate();
            
            //output
            System.out.println("");
            System.out.println(certificate1);
            System.out.println("");
            System.out.println(certificate2);
    }

}
