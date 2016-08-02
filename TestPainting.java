package painting;
/**
 *
 * @author Dan Carver
 * @since 29/07/2016
 * This is an application created to order a painting.
 * 
 */
public class TestPainting {

    //main method
    public static void main(String[] args) {
        //objects
        Painting painting1 = new Painting();
        Painting painting2 = new Painting();
        Painting painting3 = new Painting("", "", "", 1);

        //objects using the buyPainting() method to get input
        painting1.buyPainting();
        painting2.buyPainting();

        //displaying the object's data
        System.out.println(painting1.toString());
        System.out.println("");
        System.out.println(painting2.toString());
        System.out.println("");
        System.out.println(painting3.toString());
        System.out.println("");

        //displaying the method to explain commission
        painting3.explainCommission();

    }

}
