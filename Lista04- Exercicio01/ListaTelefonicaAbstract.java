package exercicio01;

import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class ListaTelefonicaAbstract implements ListaTelefonica {
	private String nome;
	private String telefone;
	private String endereco;
	private LocalDate data;
	DecimalFormat df = new DecimalFormat("#.##");      
	
	public ListaTelefonicaAbstract(String nome, String telefone, String endereco, LocalDate data) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.data = data;
	}

	@Override
	public double valorPagar() {
		double mens;

		if (endereco.contains("Blumenau")) {
			mens = getMensalidade() + (getMensalidade() * 0.09);
		} else {
			mens = getMensalidade();
		}
		
		double roundedValue = Math.round(mens * 100.0) / 100.0;
	    return roundedValue;
		//return Double.parseDouble(df.format(mens));
	}
	
	
	public abstract double getMensalidade();

	@Override
	public String toString() {
		return "Nome: " + nome + ", Telefone: " + telefone + ", Endereço: " + endereco + ", Data: "
				+ data + ". Valor a pagar: " + valorPagar();
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() == 10) {
			this.telefone = telefone;
		} else {
			System.out.println("Telefone inválido");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
