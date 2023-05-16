package exercicio01;

import java.time.LocalDate;

public class Especializada extends ListaTelefonicaAbstract {
	private int ocorrencias;

	public Especializada(String nome, String telefone, String endereco, LocalDate data, int ocorrencias) {
		super(nome, telefone, endereco, data);
		this.ocorrencias = ocorrencias;
	}

	@Override
	public double getMensalidade() {
		if (this.ocorrencias >= 1 && this.ocorrencias <= 1000) {
			return 56.40;
		} 
		
		if (this.ocorrencias >= 1001 && this.ocorrencias <= 5000) {
			return 67.80;
		} 
		
		if (this.ocorrencias >= 5001 && this.ocorrencias <= 10000) {
			return 98.50;
		} 
		
		if (this.ocorrencias >= 10001 && this.ocorrencias <= 50000) {
			return 123.90;
		} 
		
		if (this.ocorrencias > 50000) {
			return 187.82;
		} 
		
		return 0;
	}

	public int getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(int ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

}
