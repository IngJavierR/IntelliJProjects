package mx.com.chainofresponsabilities;

/**
 * Created by jrodriguez on 01/11/15.
 */
public class MainClass {

    public static void main(String[] args){

        System.out.println("Chain of responsabilities");

        Handler request1 = new ResponsabilityOne();
        Handler request2 = new ResponsabilityTwo();

        request1.SetSuccessor(request2);

        System.out.println("Prueba1");
        request1.HandlerRequest(1);

        System.out.println("Prueba2");
        request1.HandlerRequest(2);

        System.out.println("Prueba3");
        request1.HandlerRequest(3);

        System.out.println("Fin");
    }
}
