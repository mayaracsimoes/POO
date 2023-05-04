package prova;

/**
 * 
 * @author mcsimoes
 *
 */
public class OrdemServicoView {

	public static void main(String[] args) {
		
		
		int numIdentificacao = 1023;
		String nomeCli = "João";
		String enderecoCli = "Rua X, 200.";
		String telefoneCli = "(47) 99999-9999";
		char tipoVei = 'C';
		String marcaVei = "Audi";
		int kmVei = 89002;
		int qtdEixos = 30;
		int qtdHoras = 7;
		boolean precisaGuincho = true;
		
		OrdemServico ose = new OrdemServico(numIdentificacao,nomeCli,enderecoCli,telefoneCli,tipoVei,marcaVei,kmVei,qtdEixos,qtdHoras,precisaGuincho);
		ose.addProduto("óleo motor", 'L', 3, 24.2);
		ose.addProduto("velas", 'P', 4, 10.8);
		ose.addProduto("filtro", 'P', 1, 34.2);
		ose.addProduto("óleo cambio", 'L', 3, 89.3);
		ose.addProduto("graxa", 'Q', 2, 37.6);
		
		ose.imprimirOS();
	}

}
