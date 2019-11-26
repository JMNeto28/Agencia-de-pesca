package pesca;

import java.util.ArrayList;

public class NotaFiscal {
	int pacote;
	double aluguel;
	int translado;
	
	//ArrayList<NotaFiscal> listaNotas = new ArrayList<NotaFiscal>();
	
	double Relatorio() {
		
		return pacote;
	}
	
	void Dados(Pescadores cadas, String local)
	{
		System.out.println("Nome: " + cadas.nome + "\n");
		System.out.println("Local escolhido: " + local + "\n");
		
	}
	


}
