package Model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CompagnieAutoroute {
	private ArrayList<Route> routes= new ArrayList<>();;
	public ArrayList<Tarif> tarifs= new ArrayList<>();;

	public CompagnieAutoroute() {
		super();
	}

	public ArrayList<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}

	public ArrayList<Tarif> getTarifs() {
		return tarifs;
	}

	public void setTarifs(ArrayList<Tarif> tarifs) {
		this.tarifs = tarifs;
	}

	public CompagnieAutoroute(ArrayList<Route> routes, ArrayList<Tarif> tarifs) {
		super();
		this.routes = routes;
		this.tarifs = tarifs;
	}
	
	
	public BigDecimal obtenirTarif(Porte p1, Porte p2) {
		 CompagnieAutoroute compagnieAutoroute = new CompagnieAutoroute();
	 if (compagnieAutoroute.getTarifExacte(p1, p2).getPrix() ==null) { 
			return compagnieAutoroute.getTarifCalcule(p1, p2).getPrix();
			}
		 else return compagnieAutoroute.getTarifExacte(p1, p2).getPrix();
		
	}
	//to do
	private Tarif getTarifCalcule(Porte p1, Porte p2) {
		CompagnieAutoroute compagnieAutoroute = new CompagnieAutoroute();
		ArrayList<Tarif>  tarifs =compagnieAutoroute.getTarifs();
		Tarif t =new Tarif(); 
		BigDecimal prix;
		for (Tarif tarif : tarifs) {
			if (tarif.getEntree().equals(p1) && tarif.getSortie().equals(p2)) {
				prix=tarif.getPrix(); 		
				t.setPrix(prix);
				}
			else return null;}
		
		return t; }
	
	private Tarif getTarifExacte(Porte p1, Porte p2) {
		CompagnieAutoroute compagnieAutoroute = new CompagnieAutoroute();
		ArrayList<Tarif>  tarifs =compagnieAutoroute.getTarifs();
		Tarif t =new Tarif(); 
		BigDecimal prix;
		for (Tarif tarif : tarifs) {
			if (tarif.getEntree().equals(p1) && tarif.getSortie().equals(p2)) {
				prix=tarif.getPrix(); 		
				t.setPrix(prix);
				}
			else return null;}
		
		return t;
		
		
	}

	public void ajouterTarif(Tarif t) {
		tarifs.add(t);
	}
	
	public void ajouterRoute(Route r) {
		routes.add(r);
	}
}
