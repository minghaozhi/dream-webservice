
package com.lida.dream_webservice.server;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-18T12:07:59.793+08:00
 * Generated source version: 3.1.8
 * 
 */
public final class MyWebService_MyWebserviceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.dream_webservice.lida.com/", "MyWebserviceImplService");

    private MyWebService_MyWebserviceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MyWebserviceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        MyWebserviceImplService ss = new MyWebserviceImplService(wsdlURL, SERVICE_NAME);
        MyWebService port = ss.getMyWebserviceImplPort();  
        
        {
        System.out.println("Invoking add...");
        int _add_firstA = 0;
        int _add_firstB = 0;
        int _add__return = port.add(_add_firstA, _add_firstB);
        System.out.println("add.result=" + _add__return);


        }
        {
        System.out.println("Invoking minus...");
        int _minus_secondA = 0;
        int _minus_secondB = 0;
        int _minus__return = port.minus(_minus_secondA, _minus_secondB);
        System.out.println("minus.result=" + _minus__return);


        }

        System.exit(0);
    }

}
