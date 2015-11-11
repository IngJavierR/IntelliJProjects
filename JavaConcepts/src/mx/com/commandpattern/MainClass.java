package mx.com.commandpattern;

/**
 * Created by jrodriguez on 10/11/15.
 */
public class MainClass {

    public static void main(String[] args){

        System.out.println("Command pattern [Start]");

        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder);

        broker.placeOrders();

        System.out.println("Command pattern [End]");
    }
}
