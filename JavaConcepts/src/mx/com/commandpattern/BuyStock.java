package mx.com.commandpattern;

/**
 * Created by jrodriguez on 10/11/15.
 * Concret class implements Order Interface
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
