package pesca;

public class Cadastro {
	public String nome;
	public String cpf;
	public String endereço;
	public String numero;
	public int mes;
	
	private int tucunare;
	private int robalo;
	private int traira;
	
	void rankpeixe(String loc){
		if (loc == "Pantanal") 
		{
			tucunare = 1001;
			robalo = 920;
			traira = 1231;
			System.out.printf("1º - Traira = %d\n2º - Tucunare= %d\n3º - Robalo = %d\n", traira, tucunare, robalo);
		}
		else if (loc == "Rio Araguaia") 
		{
			tucunare = 10023;
			robalo = 7123;
			traira = 8733;
			System.out.printf("1º - Tucunare = %d\n2º - Traira= %d\n3º - Robalo = %d\n", tucunare, traira, robalo);
		}
		else if (loc == "Foz do Iguaçu") 
		{
			tucunare = 12023;
			robalo = 9123;
			traira = 8733;
			System.out.printf("1º - Tucunare = %d\n2º - Robalo = %d\n3º - Traira = %d\n", tucunare, robalo, traira);
		}
		else if (loc == "Litoral do Espírito Santo") 
		{
			tucunare = 2023;
			robalo = 10002;
			traira = 733;
			System.out.printf("1º - Robalo = %d\n2º - Tucunare = %d\n3º - Traira = %d\n", robalo, tucunare, traira);
		}
		else if (loc == "Rio Juma") 
		{
			tucunare = 423;
			robalo = 1002;
			traira = 7335;
			System.out.printf("1º - Traira = %d\n2º - Robalo = %d\n3º - Tucunare = %d\n", traira, robalo, tucunare);
		}
		else if (loc == "Rio Negro") 
		{
			tucunare = 4230;
			robalo = 0;
			traira = 2335;
			System.out.printf("1º - Tucunare = %d\n2º - Traira = %d\n3º - Robalo = %d\n", tucunare, traira, robalo);
		}
		else if (loc == "Barra de Maricá") 
		{
			tucunare = 0;
			robalo = 11034;
			traira = 2335;
			System.out.printf("1º - Robalo = %d\n2º - Traira = %d\n3º - Tucunare = %d\n", robalo, traira, tucunare);
		}
		else
		{
			tucunare = 230;
			robalo = 1034;
			traira = 0;
			System.out.printf("1º - Robalo = %d\n2º - Tucunare = %d\n3º - Traira = %d\n", robalo, tucunare, traira);
		}
		
	}
}