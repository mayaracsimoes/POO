package prova;

import java.util.ArrayList;


/**
 * 
 * @author mcsimoes
 *
 */
public class OrdemServico {
	private ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	private int numIdentificacao;
	private String nomeCli;
	private String enderecoCli;
	private String telefoneCli;
	private char tipoVei;
	private String marcaVei;
	private int kmVei;
	private int qtdEixos;
	private int qtdHoras;
	private boolean precisaGuincho;
	private final Double maoObra;

	public OrdemServico(int numIdentificacao, String nomeCli, String enderecoCli, String telefoneCli, char tipoVei,
			String marcaVei, int kmVei, int qtdEixos, int qtdHoras, boolean precisaGuincho) {
		this.numIdentificacao = numIdentificacao;
		this.nomeCli = nomeCli;
		this.enderecoCli = enderecoCli;
		this.telefoneCli = telefoneCli;
		this.tipoVei = tipoVei;
		this.marcaVei = marcaVei;
		this.kmVei = kmVei;
		this.qtdEixos = qtdEixos;
		this.qtdHoras = qtdHoras;
		this.precisaGuincho = precisaGuincho;
		this.maoObra = 85.00;
	}

	public void addProduto(String descricaoPro, char unidadeMedida, int qtdPro, Double valorUnitario) {
		produtos.add(new Produtos(descricaoPro, unidadeMedida, qtdPro, valorUnitario));
	}

	public Double getTotalProdutos() {
		Double valtot = 0.00;
		for (Produtos produto : produtos) {
			valtot += produto.getValorTotal();
		}
		return valtot;
	}
	public Double getTotalOS() {
		Double valOS = getTotalProdutos() + (getMaoObra() * getQtdHoras());
		if (isPrecisaGuincho()) {
			valOS = valOS + (valOS * 0.12); 
		}
		return valOS;
 	}
	
	public String getMaiorValor() {
		String produtoMaiorValor = null;
		Double maior = 0.00;
		for (Produtos produto : produtos) {
			if (produto.getValorTotal() > maior) {
				produtoMaiorValor = produto.getDescricaoPro();
				maior = produto.getValorTotal();
			}
		}

		return produtoMaiorValor;

	}
	
	public int contaUnMedida() {
		int qtdProd = 0;
		for (Produtos produto : produtos) {
			
			if (produto.getDescricaoPro().contains("Q")) {
				qtdProd++;
			}
		}
			return qtdProd;

	}

	public void imprimirOS() {
		System.out.println("O cliente " + nomeCli + " possui um veículo do tipo " + tipoVei
				+ " deixou seu veículo para revisão, com o número de telefone de contato " + telefoneCli + " gerando a ordem de serviço de número " + numIdentificacao
				+ " que totalizou um valor de R$" + getTotalOS()+ " sendo que o produto com maior valor é o " +getMaiorValor());
	}

	public int getNumIdentificacao() {
		return numIdentificacao;
	}

	public void setNumIdentificacao(int numIdentificacao) {
		this.numIdentificacao = numIdentificacao;
	}

	public String getNomeCli() {
		return nomeCli;
	}

	public void setNomeCli(String nomeCli) {
		if (nomeCli.length() > 2) {
			this.nomeCli = nomeCli;
		} else {
			System.out.println("Nome deve conter mais que 2 caracteres!");
		}
	}

	public String getEnderecoCli() {
		return enderecoCli;
	}

	public void setEnderecoCli(String enderecoCli) {
		this.enderecoCli = enderecoCli;
	}

	public String getTelefoneCli() {
		return telefoneCli;
	}

	public void setTelefoneCli(String telefoneCli) {
		this.telefoneCli = telefoneCli;
	}

	public char getTipoVei() {
		return tipoVei;
	}

	public void setTipoVei(char tipoVei) {
		this.tipoVei = tipoVei;
	}

	public String getMarcaVei() {
		return marcaVei;
	}

	public void setMarcaVei(String marcaVei) {
		this.marcaVei = marcaVei;
	}

	public int getKmVei() {
		return kmVei;
	}

	public void setKmVei(int kmVei) {
		if (kmVei > 0) {
			this.kmVei = kmVei;
		} else {
			System.out.println("Quilometragem deve ser maior que 0!");
		}

	}

	public int getQtdEixos() {
		return qtdEixos;
	}

	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public boolean isPrecisaGuincho() {
		return precisaGuincho;
	}

	public void setPrecisaGuincho(boolean precisaGuincho) {
		this.precisaGuincho = precisaGuincho;
	}

	public Double getMaoObra() {
		return maoObra;
	}

}
