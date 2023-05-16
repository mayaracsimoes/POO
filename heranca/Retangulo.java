package exemplo.heranca;

public class Retangulo extends FormaGeometricaAbstract {

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		super("Retangulo");
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double calculaArea() {
		
		return largura * altura;
	}

	@Override
	public void imprimir() {
		super.imprimir(); // executa o que esta na superclasse, se nao ele sobrescreve o metodo
	}

	
}
