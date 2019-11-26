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
		Carro carro = new Aluguel();
		Carro carro1 = new Transfer();
		int escolherFuncio = 0, e = 0;
		double aux = 0, somadou = 0, valor = 0;
		String LocalEscolhido = null, cupom;
		Scanner sc = new Scanner(System.in);
		
		
		// Menu para escolha da funcionalidade
		while (escolherFuncio != 9)
		{
			System.out.println("Escolha a Funcionalidade: \n1- Cadastro\n2- Pacotes de viagem\n3- Escolher o mes da viagem e o local de pesca conforme o mês\n4- Rank de peixes pescados no lugar de escolha \n5- Aluguel de carro para a viagem ou transfer aero/hotel\n6- Nota fiscal\n7- Inserir cupom de desconto\n8- Editar o cadastro completo\n9- Fechar o programa");
			escolherFuncio = sc.nextInt();
			sc.nextLine();
			if(escolherFuncio == 1) 
			{
				System.out.println("Cadastro:");
				p1.regis1();
			}
			else if(escolherFuncio == 2) 
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
			
				System.out.println("1- Aluguel do carro\n2- Transfer aeroporto/pesqueiro:");
				e = sc.nextInt();
				sc.nextLine();
				if(e == 1) aux = aluga.AluguelCarro();
				else aux = trans.tran();		
			}
			
			else if(escolherFuncio == 6) 
			{
				
				System.out.println("Nota fiscal para o cliente:");
				if (e == 1) somadou = (nota.Relatorio()+ carro.somar(aux));
				else somadou = (nota.Relatorio() + carro1.somar(aux));
				nota.Dados(p1, LocalEscolhido);
				System.out.printf("Valor bruto: R$%.2f\n",  somadou);
				System.out.printf("Valor com desconto: R$%.2f\n", valor);
				
			}
			else if(escolherFuncio == 7) 
			{
				System.out.println("Inserir cupom de desconto\n");
				cupom = sc.nextLine();
				//if (e == 1) somadou = (nota.Relatorio()+ carro.somar(aux));
				//else somadou = (nota.Relatorio() + carro1.somar(aux));
				if(cupom.equals("DESCONTO"))
				{
					valor = pacote.desconto(p1, somadou);
				}
				else System.out.println("O cupom não é válido\n");
			}
			
			else if(escolherFuncio == 8) 
			{
			
				System.out.println("Você pode editar o cadastro.\n");
				p1.regis1();
			}

			else
			{
				System.out.println("Obrigado por usar nosso sistema!");
				System.exit(0);
			}
		}
		
		
	}


}
