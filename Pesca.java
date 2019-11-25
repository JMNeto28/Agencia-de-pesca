package pesca;

import java.util.Scanner;

public class Pesca{

	public static void main(String[] args) {
		Pescadores p1 = new Pescadores();
		Pacote pacote = new Pacote();
		NotaFiscal nota = new NotaFiscal();
		LocaisPesca local = new LocaisPesca();
		Cadastro cadastro = new Cadastro();
		Aluguel aluga = new Aluguel();
		Transfer trans = new Transfer();
		int escolherFuncio = 0;
		double aux = 0, somadou = 0;
		String LocalEscolhido = null;
		Scanner sc = new Scanner(System.in);
		
		p1.regis1();
		// Menu para escolha da funcionalidade
		while (escolherFuncio != 7)
		{
			System.out.println("Escolha a Funcionalidade: \n1- Cadastro\n2- Pacotes de viagem\n3- Escolher o mes da viagem e o local de pesca conforme o mês\n4- Rank de peixes pescados no lugar de escolha \n5- Aluguel de carro para a viagem\n6- Nota fiscal\n7- Fechar programa");
			escolherFuncio = sc.nextInt();
			sc.nextLine();
			if(escolherFuncio == 1) 
			{
				System.out.println("Cadastro:");
			}
			if(escolherFuncio == 2) 
			{
				System.out.println("Você está na área de pacotes de viagem");
				pacote.Evip(p1, nota);
			}
			else if(escolherFuncio == 3)
			{
				System.out.println("Escolha o mes de pesca:");
				LocalEscolhido = local.escolherlocal();
			}
			else if(escolherFuncio == 4)
			{
				cadastro.rankpeixe(LocalEscolhido);
			}
		
			else if(escolherFuncio == 5) 
			{
				int e;
				System.out.println("1- Aluguel do carro\n2- Transfer hotel/pesqueiro:");
				e = sc.nextInt();
				sc.nextLine();
				if(e == 1) aux = aluga.AluguelCarro();
				else aux = trans.tran();		
			}
			
			else if(escolherFuncio == 6) 
			{
				Carro carro = new Aluguel();
				Carro carro1 = new Transfer();
				System.out.println("Nota fiscal para o cliente:");
				somadou = (nota.Relatorio()+ carro.somar(aux) + carro1.somar(aux));
				nota.Dados(p1, LocalEscolhido);
				System.out.printf("R$%.2f\n ",  somadou);
			}

			else
			{
				System.out.println("Obrigado por usar nosso sistema!");
				System.exit(0);
			}
		}
		
		
	}


}
