
package com.superwebservice.publictypes;

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
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-02-06T12:36:32.940+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class Meteo_MeteoPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.superwebservice.com/publictypes", "ServeurWeatherService");

    private Meteo_MeteoPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ServeurWeatherService.WSDL_LOCATION;
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
      
        ServeurWeatherService ss = new ServeurWeatherService(wsdlURL, SERVICE_NAME);
        Meteo port = ss.getMeteoPort();  
        
        {
        System.out.println("Invoking deposerRequete...");
        com.superwebservice.publictypes.DeposerRequete _deposerRequete_deposerRequete = null;
        java.lang.String _deposerRequete__return = port.deposerRequete(_deposerRequete_deposerRequete);
        System.out.println("deposerRequete.result=" + _deposerRequete__return);


        }
        {
        System.out.println("Invoking obtenirSituationMeteo...");
        java.lang.String _obtenirSituationMeteo_obtenirSituationMeteo = "";
        com.superwebservice.publictypes.ObtenirSituationMeteoResponse _obtenirSituationMeteo__return = port.obtenirSituationMeteo(_obtenirSituationMeteo_obtenirSituationMeteo);
        System.out.println("obtenirSituationMeteo.result=" + _obtenirSituationMeteo__return);


        }

        System.exit(0);
    }

}
