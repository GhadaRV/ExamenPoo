package Model;

public class PorteSortie extends Porte {
	private int numeroDePorte;

	public Integer getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	public PorteSortie(int numeroDePorte) {
		super();
		this.numeroDePorte = numeroDePorte;
	}

	public PorteSortie() {
		super();
	}
	
	
}
