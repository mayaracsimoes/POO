package try_catch;

public class exemplo {

	public static void main(String[] args) {
		exemplo ex = new exemplo();
		ex.dividir();

	}

	public void dividir() {
			int i = 0;
			//TENTE EXECUTAR O COMANDO ABAIXO
			try {
			i = i/i;
			//SE NÃO CONSEGUIR, PEGUE A EXCEÇÃO
			} catch (Exception e) {
			//TRATAR A EXCEÇÃO
			System.out.println("Erro " + e);
			}
			//CÓDIGO CONTINUA EXECUTANDO
			System.out.println("Processando... ");
	}
}
