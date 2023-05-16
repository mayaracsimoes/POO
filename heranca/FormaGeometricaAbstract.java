package exemplo.heranca;

public abstract class FormaGeometricaAbstract implements FormaGeometrica {
	
	private String nome;
	
	
	public FormaGeometricaAbstract(String nome) {
		this.nome = nome;
	}

	
	public String getNome() {
		return nome;
	}

	public void imprimir() {
		imprimir("default");
	}
	
	public void imprimir(String qualquer) {
		System.out.println("Nome " + nome + "Tipo " + qualquer);
	}
	
}
