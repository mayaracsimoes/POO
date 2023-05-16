package exercicio_heranca;
/**
 * 
 * @author Mayara Cardoso Simões
 *
 */

public class Assalariado extends FuncionarioAbstract {

	private float salarioMensal;
	
	public Assalariado(String nome, int id, float salario_mensal) {
		
		super(nome, id);
		this.salarioMensal = salario_mensal;
	}

	@Override
	public double calcularSalario() {
		return salarioMensal;
	}

}
