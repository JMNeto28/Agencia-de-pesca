package pesca;

import java.util.Scanner;

public class Pesca extends Cadastro{

	public static void main(String[] args) {
		Pescadores p1 = new Pescadores();
		Pacote pacote = new Pacote();
		NotaFiscal nota = new NotaFiscal();
		LocaisPesca local = new LocaisPesca();
		Cadastro cadastro = new Cadastro();
		Aluguel aluga = new Aluguel();
		int escolherFuncio = 0;
		String LocalEscolhido = null;
		Scanner sc = new Scanner(System.in);
		
		//Começo é a parte do cadastro
		System.out.println("Realize o cadastro do pescador:");
		System.out.println("Digite o nome:");
		cadastro.nome = sc.nextLine();
		System.out.println("Digite o CPF:");
		cadastro.cpf = sc.nextLine();
		System.out.println("Digite o endereço:");
		cadastro.endereço = sc.nextLine();
		System.out.println("Digite o numero:");
		cadastro.numero = sc.nextLine();
		//escolha do menu com inteiros
		System.out.println("Digite o tipo de pescador (em breve):");
		p1.tipopescador = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite 1 se o cliente for VIP ou 2 se não for VIP:");
		p1.vip = sc.nextInt();
		sc.nextLine();

		// Menu para escolha da funcionalidade
		while (escolherFuncio != 7)
		{
			System.out.println("Escolha a Funcionalidade: \n1- Pacotes de viagem\n2- Local de pesca\n3- Rank de peixes\n4- Relatorio\n5- Aluguel de carro\n6-     \n7- Fechar programa");
			escolherFuncio = sc.nextInt();
			sc.nextLine();
			if(escolherFuncio == 1) 
			{
				System.out.println("Você está na área de pacotes de viagem");
				pacote.Evip(p1, nota);
			}
			else if(escolherFuncio == 2)
			{
				System.out.println("Escolha o mes de pesca:");
				LocalEscolhido = local.escolherlocal();
			}
			else if(escolherFuncio == 3)
			{
				cadastro.rankpeixe(LocalEscolhido);
			}
		
			else if(escolherFuncio == 4) 
			{
				System.out.println("Nota fiscal para o cliente:");
				System.out.println("R$" + nota.Relatorio(cadastro, LocalEscolhido));
			}
			else if(escolherFuncio == 5) 
			{
				System.out.println("Aluguel do carro:");
				aluga.AluguelCarro(nota);
			}
			else if(escolherFuncio == 6) 
			{
			
			}
			
			else
			{
				System.out.println("Obrigado por usar nosso sistema!");
				System.exit(0);
			}
		}
	}

}
