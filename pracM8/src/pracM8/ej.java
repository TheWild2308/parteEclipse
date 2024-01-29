package pracM8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ej {
	
	void rellenar(double tablero[][], int num) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j]=num;
				num++;
			}
		}
	}
	
	String pos(double tablero[][],int casilla) {
		int fila=0;
		int columna=0;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j]==casilla) {
					fila=i+1;
					columna=j+1;
				}
			}
		}
		return "La casilla "+casilla+" se encuentra en la fila "+fila+" y columna "+columna;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		ej programa=new ej();
		
		double tablero[][]=new double[8][8];
		int num=1;
		programa.rellenar(tablero, num);
		
		System.out.println("Entra la casilla: ");
		int casilla=Integer.parseInt(entrada.readLine());
		
		System.out.println(programa.pos(tablero, casilla));
		
		

	}

}
