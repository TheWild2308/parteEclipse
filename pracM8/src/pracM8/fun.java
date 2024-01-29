package pracM8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fun {
	
	boolean valido (int opcion) {
		boolean valido=false;
		if (opcion>=1 && opcion<4) {
			valido=true;
			return valido;
		}
		return valido;
	}
	
	double Celsius (double celsius) {
		double Fahrenheit=(celsius*9/5)+32;
		return Fahrenheit;
	}
	
	double  Fahrenheit (double Fahrenheit) {
		double celsius=(Fahrenheit-32)*5/9;
		return celsius;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		fun programa=new fun();
		
		System.out.println("CONVERSOR DE TEMPERATURAS\n"
				+ "===========================\n"
				+ "1. Fahrenheit a Celsius.\n"
				+ "2. Celsius a Fahrenheit.\n"
				+ "3. Salir.");	
		
		boolean valido=false;
		int opcion=0;
		
		do {
			
		System.out.println("Elige una opción: ");
		opcion=Integer.parseInt(entrada.readLine());
		
		valido=programa.valido(opcion);
		
		
		} while (!valido);
		
		if (opcion==1) {
			System.out.println("Entra la temperatura en Celsius: ");
			double celsius=Double.parseDouble(entrada.readLine());
			System.out.println("La temperatura en Fahrenheit és: "+programa.Celsius(celsius));
		}
		
		if (opcion==2) {
			System.out.println("Entra la temperatura en Fahrenheit: ");
			double Fahrenheit=Double.parseDouble(entrada.readLine());
			System.out.println("La temperatura en Celsius és: "+programa.Fahrenheit(Fahrenheit));
		}
	}

}