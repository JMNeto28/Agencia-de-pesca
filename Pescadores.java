package pesca;

import java.util.Scanner;

public class Pescadores extends Cadastro {
	int tip, tip1;
	void regis1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Realize o cadastro do pescador:");
		System.out.println("Digite o nome:");
		this.nome = sc.nextLine();
		System.out.println("Digite o CPF:");
		this.cpf = sc.nextLine();
		System.out.println("Digite o endereço:");
		this.endereço = sc.nextLine();
		System.out.println("Digite o numero:");
		this.numero = sc.nextLine();
		System.out.println("Digite o tipo de pescador (em breve):");
		tip = sc.nextInt();
		sc.nextLine();
		this.setTipoPescador(tip);
		System.out.println("Digite 1 se o cliente for VIP ou 2 se não for VIP:");
		tip1 = sc.nextInt();
		sc.nextLine();
		this.setVip(tip1);
	}
}



