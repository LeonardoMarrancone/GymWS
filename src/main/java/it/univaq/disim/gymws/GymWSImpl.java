/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.gymws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import wsdl.gymrest.disim.univaq.it.gymportalws.MsgErrore;
import wsdl.gymrest.disim.univaq.it.gymportalws.TipoListaUtente;
import wsdl.gymrest.disim.univaq.it.gymportalws.TipoUtente;

/**
 *
 * @author leonardomarrancone
 */
@WebService(serviceName = "GymPortalWSMain", portName = "GymPortalWSSOAP", endpointInterface = "wsdl.gymrest.disim.univaq.it.gymportalws.GymPortalWSInterface", targetNamespace = "http://it.univaq.disim.GymREST.wsdl/GymPortalWS.wsdl", wsdlLocation = "WEB-INF/wsdl/GymPortalWS.wsdl")
public class GymWSImpl {
    
    private static final String urlDB = "jdbc:mysql://127.0.0.1:8889/gymportal?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String userDB = "gymportal";
    private static final String pswDB = "gymportal";
    
    
    public static final String GET_UTENTI= "SELECT * FROM user"; 
    
    
    
    public wsdl.gymrest.disim.univaq.it.gymportalws.TipoListaUtente getUtenti() throws MsgErrore {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        
         TipoListaUtente listaUtenti = new TipoListaUtente();
        try (Connection connection = DriverManager.getConnection(urlDB,userDB,pswDB);
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(GET_UTENTI);) {

                while (rs.next()){
                    TipoUtente utente = new TipoUtente();
                    utente.setId(rs.getLong(1));
                    utente.setEmail(rs.getString(3));
                    utente.setLastName(rs.getString(4));
                    utente.setName(rs.getString(5));
                    utente.setPassword(rs.getString(6));
                    utente.setUserName(rs.getString(7));
                    
                    listaUtenti.getUtente().add(utente);
                }
        
            } catch (SQLException ex) { 
            Logger.getLogger(GymWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return listaUtenti;
        
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
