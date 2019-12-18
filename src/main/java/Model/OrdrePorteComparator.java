package Model;

import java.util.Comparator;



public class OrdrePorteComparator implements Comparator<Porte> {
	@Override
	public int compare(Porte p1, Porte p2) {
		 int i =p1.getNumeroDePorte().compareTo(p2.getNumeroDePorte());
				
		return i; 
	}
	}
