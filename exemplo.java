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
			//SE N�O CONSEGUIR, PEGUE A EXCE��O
			} catch (Exception e) {
			//TRATAR A EXCE��O
			System.out.println("Erro " + e);
			}
			//C�DIGO CONTINUA EXECUTANDO
			System.out.println("Processando... ");
	}
}
