
package org.cl;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "spcloud", targetNamespace = "http://sp1.org/", wsdlLocation = "http://localhost:8080/spamservice/spcloud?WSDL")
public class Spcloud_Service
    extends Service
{

    private final static URL SPCLOUD_WSDL_LOCATION;
    private final static WebServiceException SPCLOUD_EXCEPTION;
    private final static QName SPCLOUD_QNAME = new QName("http://sp1.org/", "spcloud");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/spamservice/spcloud?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SPCLOUD_WSDL_LOCATION = url;
        SPCLOUD_EXCEPTION = e;
    }

    public Spcloud_Service() {
        super(__getWsdlLocation(), SPCLOUD_QNAME);
    }

    public Spcloud_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SPCLOUD_QNAME, features);
    }

    public Spcloud_Service(URL wsdlLocation) {
        super(wsdlLocation, SPCLOUD_QNAME);
    }

    public Spcloud_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SPCLOUD_QNAME, features);
    }

    public Spcloud_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Spcloud_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Spcloud
     */
    @WebEndpoint(name = "spcloudPort")
    public Spcloud getSpcloudPort() {
        return super.getPort(new QName("http://sp1.org/", "spcloudPort"), Spcloud.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Spcloud
     */
    @WebEndpoint(name = "spcloudPort")
    public Spcloud getSpcloudPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sp1.org/", "spcloudPort"), Spcloud.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SPCLOUD_EXCEPTION!= null) {
            throw SPCLOUD_EXCEPTION;
        }
        return SPCLOUD_WSDL_LOCATION;
    }

}
