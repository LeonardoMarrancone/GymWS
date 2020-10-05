/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.gymwsclient;

/**
 *
 * @author apost
 */
public class Tester {
    
        public static void main(String[] args) {

        try { // Call Web Service Operation
            
            GymPortalWSMain service = new GymPortalWSMain();
            GymPortalWSInterface port = service.getGymPortalWSSOAP();
            
            System.out.println("Get Ruoli");
            TipoListaRuolo ruoli = port.getRuoli();
            for(TipoRuolo ruolo: ruoli.getRuolo()){
                System.out.println(ruolo.getId() + " " + ruolo.getRole());
            }
            
            System.out.println("--------------------------------------");
            
            System.out.println("Get Utenti");
            TipoListaUtente utenti = port.getUtenti();
            for(TipoUtente utente: utenti.getUtente()){
                System.out.println(utente.getId() + " " + utente.getName() + " " + utente.getLastname() + " " + utente.getEmail() + " " + utente.getUsername() + " " + utente.getPassword());
            }
            
            System.out.println("--------------------------------------");

            System.out.println("Get Utente 1");
            System.out.println(port.getUtente(1).getEmail());
            
            System.out.println("--------------------------------------");
            
            System.out.println("Add Ruolo to Utente");
            port.addRuoloUtente(2, 1);

        } catch (Exception ex) {
            // TODO handle custom exceptions here
            ex.printStackTrace();
        }

    }
}
