
package webclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegistrationService", targetNamespace = "http://webservice.auction/", wsdlLocation = "http://127.0.0.1:8080/registration?wsdl")
public class RegistrationService
    extends Service
{

    private final static URL REGISTRATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGISTRATIONSERVICE_EXCEPTION;
    private final static QName REGISTRATIONSERVICE_QNAME = new QName("http://webservice.auction/", "RegistrationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8080/registration?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTRATIONSERVICE_WSDL_LOCATION = url;
        REGISTRATIONSERVICE_EXCEPTION = e;
    }

    public RegistrationService() {
        super(__getWsdlLocation(), REGISTRATIONSERVICE_QNAME);
    }

    public RegistrationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTRATIONSERVICE_QNAME, features);
    }

    public RegistrationService(URL wsdlLocation) {
        super(wsdlLocation, REGISTRATIONSERVICE_QNAME);
    }

    public RegistrationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTRATIONSERVICE_QNAME, features);
    }

    public RegistrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegistrationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Registration
     */
    @WebEndpoint(name = "RegistrationPort")
    public Registration getRegistrationPort() {
        return super.getPort(new QName("http://webservice.auction/", "RegistrationPort"), Registration.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Registration
     */
    @WebEndpoint(name = "RegistrationPort")
    public Registration getRegistrationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.auction/", "RegistrationPort"), Registration.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTRATIONSERVICE_EXCEPTION!= null) {
            throw REGISTRATIONSERVICE_EXCEPTION;
        }
        return REGISTRATIONSERVICE_WSDL_LOCATION;
    }

}