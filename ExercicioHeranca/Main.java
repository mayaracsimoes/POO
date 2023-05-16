package exercicio_heranca;
/**
 * 
 * @author Mayara Cardoso Simões
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
	private List<Funcionario> funcionario = new ArrayList<>();

	public Main() {
		
		Assalariado a1 = new Assalariado("Mayara", 20, 5000.56f);
		Assalariado a2 = new Assalariado("Júlio", 10, 6958.45f);
		Assalariado a3 = new Assalariado("Maria", 5, 789.45f);
		
		funcionario.add(a1);
		funcionario.add(a2);
		funcionario.add(a3);
		
		PorHora pH1 = new PorHora("Luiz", 4, 20, 5.8f);
		PorHora pH2 = new PorHora("Lucas", 6, 7, 9.2f);
		PorHora pH3 = new PorHora("Amanda", 8, 16,10f);
		
		funcionario.add(pH1);
		funcionario.add(pH2);
		funcionario.add(pH3);
		
		for (Funcionario funcionarios : funcionario) {
			System.out.println(funcionarios);
		}
	}
	public static void main(String[] args) {
		new Main();

	}

}
