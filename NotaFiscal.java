package pesca;



public class NotaFiscal {
	int pacote;
	double aluguel;
	int translado;
	
	
	double Relatorio() {
		
		return pacote;
	}
	
	void Dados(Pescadores cadas, String local, Cadastro cad)
	{
		System.out.println("Nome: " + cadas.nome + "\n");
		System.out.println("Tipo de pescador:\n");
		if(cad.getTipoPescador() == 1) System.out.println("Pescador esportivo.\n");
		else if(cad.getTipoPescador() == 2) System.out.println("Pescador amador.\n");
		else System.out.println("Pescador profissional.\n");
		System.out.println("Local escolhido: " + local + "\n");
		
	}




}
