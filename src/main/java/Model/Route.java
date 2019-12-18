package Model;

import java.util.ArrayList;
import java.util.List;

public class Route {
	
	ArrayList<Porte> portes = new ArrayList<>();
	public Route() {
		super();
	}

	public Route(ArrayList<Porte> portes) {
		super();
		this.portes = portes;
	}

	public ArrayList<Porte> getPortes() {
		return portes;
	}

	public void setPortes(ArrayList<Porte> portes) {
		this.portes = portes;
	}
	
	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}

	public void addPorte(Porte p) {
		portes.add(p);
	}

}
