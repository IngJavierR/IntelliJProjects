package mx.com.chainofresponsabilities;

/**
 * Created by jrodriguez on 01/11/15.
 */
public class ResponsabilityTwo extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if(request == 2){
            System.out.println("ResponsabilityTwo Implementation");
        }else if(Successor != null){
            Successor.HandlerRequest(request);
        }
    }
}
