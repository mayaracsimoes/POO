package exemplo.heranca;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private List<FormaGeometrica> formas = new ArrayList<>();
	
	public Main() {
		
		Retangulo r1 = new Retangulo(100,200);
		Retangulo r2 = new Retangulo(200,100);
		
		formas.add(r1);
		formas.add(r2);
		
		Circulo c1 = new Circulo(15);
		Circulo c2 = new Circulo(20);
		
		formas.add(c1);
		formas.add(c2);
		
		for (FormaGeometrica formaGeometrica : formas) {
			System.out.println("Area: "+ formaGeometrica.calculaArea());
		}
		
	}
	public static void main(String[] args) {
		

	}

}
