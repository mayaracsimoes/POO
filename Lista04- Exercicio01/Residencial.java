package exercicio01;

import java.time.LocalDate;

public class Residencial extends ListaTelefonicaAbstract {
	private boolean conexao;
	
	public Residencial(String nome, String telefone, String endereco, LocalDate data, boolean conexao) {
		super(nome, telefone, endereco, data);
		this.conexao = conexao;
		
	}

	@Override
	public double getMensalidade() {
		return 25.00;
	}
	
	
	public boolean isConexao() {
		return conexao;
	}

	public void setConexao(boolean conexao) {
		this.conexao = conexao;
	}
	
}
