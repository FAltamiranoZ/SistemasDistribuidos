
package webserviceclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyWebService", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebService {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://webservices/", className = "webserviceclient.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://webservices/", className = "webserviceclient.SumaResponse")
    @Action(input = "http://webservices/MyWebService/sumaRequest", output = "http://webservices/MyWebService/sumaResponse")
    public int suma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
