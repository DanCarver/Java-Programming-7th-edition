package painting;

import java.util.Scanner;
public class Painting {
//data fields
private String title;
private String artist;
private String medium;
private double price;
private double finalPrice;
private double commission;
private final double COMMISSION_RATE = .2;

//object
Painting newPainting;

    //default constructor
    public Painting(){
        
    }

    //constructor
    public Painting(String t, String a, String m, double p){
        title = t;
        artist = a;
        medium = m;
        price = p;
        
        title = "Sahara sand devils";
        artist = "John Doe";
        medium = "water color";
        price = 100.00;
    }
   


    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //method to prompt for input and return the painting
    public Painting buyPainting(){
        //scanner object
        Scanner input = new Scanner(System.in);
        
        //input prompts
        System.out.println("Enter the title of the painting >>");
        title = input.nextLine();
        System.out.println("Enter the artist's name >>");
        artist = input.nextLine();
        System.out.println("Enter the medium of the painting >>");
        medium = input.nextLine();
        System.out.println("Enter the price of the painting >>");
        price = input.nextDouble();
        
        //setting and returning the object
        newPainting = new Painting();
        
        newPainting.setArtist(artist);
        newPainting.setTitle(title);
        newPainting.setMedium(medium);
        newPainting.setPrice(price);
        
        return newPainting;
    }
    
        //method to explain commission rate
        public void explainCommission(){
        System.out.println("The commission rate is 20% of the price of the "
                + "painting you purchase.");
    }
        

        //toString method to display object
        @Override
        public String toString(){   
        //arithmetic to properly display data    
        commission = price * COMMISSION_RATE;
        finalPrice = commission + price;
        
        return "The painting " + title + ", by " + artist + ", with the medium "
            + medium + ", will cost $" + price + " plus commision of %20. The final cost is $" + finalPrice;
        
        }
        

}