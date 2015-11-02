package mx.com.chainofresponsabilities;

/**
 * Created by jrodriguez on 01/11/15.
 */
public abstract class Handler {

    protected Handler Successor;

    public void SetSuccessor(Handler successor){
        Successor = successor;
    }

    public abstract void HandlerRequest(int request);
}
