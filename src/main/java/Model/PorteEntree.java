package Model;


public class PorteEntree extends Porte {

	private int numeroDePorte;

	public Integer getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	public PorteEntree(int numeroDePorte) {
		super();
		this.numeroDePorte = numeroDePorte;
	}

	public PorteEntree() {
		super();
	}
	
	
}
