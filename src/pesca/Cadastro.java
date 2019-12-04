package pesca;


public class Cadastro{
	
	private int tucunare;
	private int robalo;
	private int traira;
	
	
	
	void rankpeixe(String loc){
		if (loc == "Pantanal") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 1001;
			robalo = 920;
			traira = 1231;
			System.out.printf("1º - Traira = %d especies pescadas\n2º - Tucunare= %d especies pescadas\n3º - Robalo = %d especies pescadas\n", traira, tucunare, robalo);
		}
		else if (loc == "Rio Araguaia") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 10023;
			robalo = 7123;
			traira = 8733;
			System.out.printf("1º - Tucunare = %d especies pescadas\n2º - Traira= %d especies pescadas\n3º - Robalo = %d especies pescadas\n", tucunare, traira, robalo);
		}
		else if (loc == "Foz do Iguaçu") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 12023;
			robalo = 9123;
			traira = 8733;
			System.out.printf("1º - Tucunare = %d especies pescadas\n2º - Robalo = %d especies pescadas\n3º - Traira = %d especies pescadas\n", tucunare, robalo, traira);
		}
		else if (loc == "Litoral do Espírito Santo") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 2023;
			robalo = 10002;
			traira = 733;
			System.out.printf("1º - Robalo = %d especies pescadas\n2º - Tucunare = %d especies pescadas\n3º - Traira = %d especies pescadas\n", robalo, tucunare, traira);
		}
		else if (loc == "Rio Juma") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 423;
			robalo = 1002;
			traira = 7335;
			System.out.printf("1º - Traira = %d especies pescadas\n2º - Robalo = %d especies pescadas\n3º - Tucunare = %d especies pescadas\n", traira, robalo, tucunare);
		}
		else if (loc == "Rio Negro") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 4230;
			robalo = 0;
			traira = 2335;
			System.out.printf("1º - Tucunare = %d especies pescadas\n2º - Traira = %d especies pescadas\n3º - Robalo = %d especies pescadas\n", tucunare, traira, robalo);
		}
		else if (loc == "Barra de Maricá") 
		{
			System.out.println("" + loc + "\n");
			tucunare = 0;
			robalo = 11034;
			traira = 2335;
			System.out.printf("1º - Robalo = %d especies pescadas\n2º - Traira = %d especies pescadas\n3º - Tucunare = %d especies pescadas\n", robalo, traira, tucunare);
		}
		else
		{
			System.out.println("" + loc + "\n");
			tucunare = 230;
			robalo = 1034;
			traira = 0;
			System.out.printf("1º - Robalo = %d especies pescadas\n2º - Tucunare = %d especies pescadas\n3º - Traira = %d especies pescadas\n", robalo, tucunare, traira);
		}
		
	}

	}

	

