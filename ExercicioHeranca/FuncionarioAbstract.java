package exercicio_heranca;

/**
 * 
 * @author Mayara Cardoso Simões
 *
 */
public abstract class FuncionarioAbstract implements Funcionario {
	private String nome;
	private int id;
	private float salarioBase;
	
	public FuncionarioAbstract(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public float getSalario_base() {
		return salarioBase;
	}

	public void setSalario_base(float salario_base) {
		this.salarioBase = salario_base;
	}

	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " ID: "+ this.id + " Salário total: " + calcularSalario();
	}
	
	
}
