package pesca;

import java.util.Scanner;

public class Pesca {

	public static void main(String[] args) {
		Pescadores p1 = new Pescadores();
		Pacote pacote = new Pacote();
		NotaFiscal nota = new NotaFiscal();
		int escolherFuncio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Realize o cadastro do pescador:");
		p1.nome = "João";
		p1.cpf = "11919191";
		p1.telefone = "12121212";
		p1.cidade = "guarapirin";
		p1.datames = "setembro";
		p1.tipopescador = "1";
		p1.vip = 0;
	

		
		while (escolherFuncio != 7)
		{
			System.out.println("Escolha a Funcionalidade: \n1- Pacotes de viagem\n2- Local de pesca\n3- Rank de peixes\n4- Alugeul de carro\n5- Translado aero/hotel\n6- Nota fiscal\n7- Editar registro\n8- Fechar programa");
			escolherFuncio = sc.nextInt();
			sc.nextLine();
			if(escolherFuncio == 1) 
			{
				System.out.println("Você está na área de pacotes de viagem");
				pacote.Evip(p1, nota);
				
			}
		
			if(escolherFuncio == 4) 
			{
				System.out.println("Nota fiscal para o cliente:");
				nota.Relatorio();
			}
		
			if(escolherFuncio == 7) 
			{
				System.out.println("Obrigado por usar nosso sistema!");
				System.exit(0);
			}
		}
	}

}
