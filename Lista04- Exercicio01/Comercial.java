package exercicio01;

import java.time.LocalDate;

public class Comercial extends ListaTelefonicaAbstract {
	private String ramoAtividade;
	
	public Comercial(String nome, String telefone, String endereco, LocalDate data, String ramoAtividade) {
		super(nome, telefone, endereco, data);
		this.ramoAtividade = ramoAtividade;
	}

	@Override
	public double getMensalidade() {
		if(getData().isBefore(LocalDate.of(2018, 1, 2))) {
			return 27.50;	
		} else {
			return 37.50;
		}
		
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	
}
