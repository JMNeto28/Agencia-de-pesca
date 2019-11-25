package pesca;

public class NotaFiscal {
	int pacote;
	double aluguel;
	int translado;
	
	double Relatorio() {
		
		return pacote;
	}
	
	void Dados(Pescadores cadas, String local)
	{
		System.out.println("Nome: " + cadas.nome + "\n");
		System.out.println("Local escolhido: " + local + "\n");
	}

}
