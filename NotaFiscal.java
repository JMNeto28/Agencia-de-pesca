package pesca;

public class NotaFiscal {
	int pacote;
	int aluguel;
	int translado;
	
	void Relatorio() {
		int conta;
		conta = pacote + aluguel + translado;
		System.out.println("" + conta);
	}

}
