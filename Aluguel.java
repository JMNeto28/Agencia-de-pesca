package pesca;

import java.util.Scanner;

public class Aluguel extends Carro {
	
	Scanner sc = new Scanner(System.in);
	int esc, conta;
		int AluguelCarro(NotaFiscal nota1) 
		{
			esc = sc.nextInt();
			sc.nextLine();
			System.out.println("Escolha seu tipo de carro para o aluguel.\n1- Básico\n2- Médio\n3- Luxo");
			if (esc == 1)
			{
				System.out.println("O carro basico foi escolhido.");
				this.ar = 300; 
				this.direcaoeletrica = 200;
				nota1.aluguel = this.ar + this.direcaoeletrica;
			}
			else if (esc == 2)
			{
				System.out.println("O médio basico foi escolhido.");
				this.ar = 300; 
				this.direcaoeletrica = 200;
				this.alarme = 400;
				this.seguro = 150;
				nota1.aluguel = this.ar + this.direcaoeletrica + this.alarme + this.seguro;
			}
			else
			{
				System.out.println("O luxo basico foi escolhido.");
				this.ar = 300; 
				this.direcaoeletrica = 200;
				this.alarme = 400;
				this.seguro = 150;
				this.segurototal = 350;
				nota1.aluguel = this.ar + this.alarme + this.alarme + this.seguro + this.segurototal;
			}
			return conta;

		}
}
