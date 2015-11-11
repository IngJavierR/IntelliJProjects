package mx.com.commandpattern;

/**
 * Created by jrodriguez on 10/11/15.
 * Request class
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] bought");
    }

    public void sell(){
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] sold");
    }
}
