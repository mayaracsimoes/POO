package prova;
/**
 * 
 * @author mcsimoes
 *
 */
public class Produtos {
	private String descricaoPro;
	private char unidadeMedida;
	private int qtdPro;
	private Double valorUnitario;
	
	public Produtos(String descricaoPro, char unidadeMedida, int qtdPro, Double valorUnitario) {
		this.descricaoPro = descricaoPro;
		this.unidadeMedida = unidadeMedida;
		this.qtdPro = qtdPro;
		this.valorUnitario = valorUnitario;
	}

	public Double getValorTotal() {
		return this.qtdPro * this.valorUnitario;
		
	}
	public String getDescricaoPro() {
		return descricaoPro;
	}

	public void setDescricaoPro(String descricaoPro) {
		this.descricaoPro = descricaoPro;
	}

	public char getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(char unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public int getQtdPro() {
		return qtdPro;
	}

	public void setQtdPro(int qtdPro) {
		this.qtdPro = qtdPro;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
}
