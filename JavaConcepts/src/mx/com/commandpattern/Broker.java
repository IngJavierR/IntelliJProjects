package mx.com.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jrodriguez on 10/11/15.
 * Command Invoker class
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
