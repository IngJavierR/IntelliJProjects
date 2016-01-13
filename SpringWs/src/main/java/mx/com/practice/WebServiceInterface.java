package mx.com.practice;

import mx.com.practice.Data.Cliente;
import org.apache.cxf.annotations.WSDLDocumentation;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by jrodriguez on 27/09/15.
 */
@WebService
public interface WebServiceInterface {
    @WSDLDocumentation("Prueba Metodo Spring Rest")
    String testService(@WebParam(name="cliente") Cliente cliente);
}
