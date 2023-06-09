package exemplo.heranca;

public class Circulo extends FormaGeometricaAbstract {

	private double raio;
	
	public Circulo(double raio) {
		super("Circulo");
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}


}
