package mx.com.chainofresponsabilities;

/**
 * Created by jrodriguez on 01/11/15.
 */
public class ResponsabilityOne extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if(request == 1){
            System.out.println("ResponsabilityOne Implementation");
        }else if(Successor != null){
            Successor.HandlerRequest(request);
        }
    }
}
