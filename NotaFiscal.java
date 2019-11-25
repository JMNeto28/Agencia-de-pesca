package pesca;

public class NotaFiscal {
	int pacote;
	int aluguel;
	int translado;
	
	
	
	int Relatorio(Cadastro cads, String local) {
		System.out.println("Nome: " + cads.nome + "\n");
		System.out.println("Local escolhido: " + local + "\n");
		return pacote + aluguel + translado;
	}

}
