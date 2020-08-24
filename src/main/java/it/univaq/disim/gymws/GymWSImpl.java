/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.gymws;

import javax.jws.WebService;
import wsdl.gymrest.disim.univaq.it.gymportalws.MsgErrore;

/**
 *
 * @author leonardomarrancone
 */
@WebService(serviceName = "GymPortalWSMain", portName = "GymPortalWSSOAP", endpointInterface = "wsdl.gymrest.disim.univaq.it.gymportalws.GymPortalWSInterface", targetNamespace = "http://it.univaq.disim.GymREST.wsdl/GymPortalWS.wsdl", wsdlLocation = "WEB-INF/wsdl/GymPortalWS.wsdl")
public class GymWSImpl {

    public wsdl.gymrest.disim.univaq.it.gymportalws.TipoListaUtente getUtenti() throws MsgErrore {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean addRuoloUtente(wsdl.gymrest.disim.univaq.it.gymportalws.TipoUtente utente, wsdl.gymrest.disim.univaq.it.gymportalws.TipoRuolo ruolo) throws MsgErrore {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void deleteRuoloUtente(wsdl.gymrest.disim.univaq.it.gymportalws.TipoUtente utente, wsdl.gymrest.disim.univaq.it.gymportalws.TipoRuolo ruolo) throws MsgErrore {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
