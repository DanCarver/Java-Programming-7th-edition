package sandwich;

/**
 *
 * @author dan carver
 * @since 18/07/2016
 * A program for creating a sandwich for you to purchase. This class creates a
 * sandwich object.
 * 
 */

import java.util.Scanner;
public class Sandwich {

    public static void main(String[] args) {
        //object
        Sandwich sandwich = new Sandwich();
        
        sandwich = getData(sandwich);
        
        System.out.println("Your sandwich details:");
        System.out.println("You ordered a "+ sandwich.getMainIngredient()
        + " sandwich on " + sandwich.getBread());
    }
    
    public static TestSandwich getData(TestSandwich s){
        //this method retrieves data from TestSandwich class for the object
        
        //variables
        String ingredient;
        String bread;
        double price;
        
        //scanner object
        Scanner input = new Scanner(System.in);
        
        //input prompts
        System.out.println("What type of sandwich would you like?");
        ingredient = input.nextLine();
        System.out.println("What type of bread would you like?");
        bread = input.nextLine();
        System.out.println("Enter the price of your sandwich");
        price = input.nextDouble();
        
        //returning data for object to use
        s.setMainIngredient(ingredient);
        s.setBread(bread);
        s.setPrice(price);
        return s;
    }
    
}
