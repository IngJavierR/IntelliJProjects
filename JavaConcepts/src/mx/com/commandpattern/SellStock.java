package mx.com.commandpattern;

/**
 * Created by jrodriguez on 10/11/15.
 * Concret class implements Order Interface
 */
public class SellStock implements Order{
    public Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
