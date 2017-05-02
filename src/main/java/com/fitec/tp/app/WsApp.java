package com.fitec.tp.app;

import javax.xml.ws.Endpoint;

import com.fitec.tp.service.CalculateurImpl;

public class WsApp {

	public static void main(String[] args) {
		//String sWdlURL = "http://localhost:8080/WsJdk/calculateur";
		String sWdlURL = "http://HPG3i3-37:8080/WsJdk/calculateur";
		
		CalculateurImpl wsImpl = new CalculateurImpl();
		Endpoint.publish(sWdlURL, wsImpl);
		System.out.println("serveur démarré / en attente des requetes");
		try {
			Thread.sleep(10* 60 * 1000); //pause de 10 minuttes
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);

	}

}
