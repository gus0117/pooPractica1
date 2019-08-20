package aplicacion.test;

import java.util.Scanner;

public class Punto3 {

	private static int FILAS = 3;
	private static int COLUMNAS = 4;
	
	private static int MINIMO = 1;
	private static int MAXIMO = 100;
	
	public static int[][] cargarMatriz(){
		int matriz[][] = new int[FILAS][COLUMNAS];
		for(int i = 0; i < FILAS; i++) {
			for(int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = (int)(Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
			}
		}
		return matriz;
	}
	
	public static void mostrarMatriz(int matriz[][]) {
		for(int i = 0; i < FILAS; i++) {
			for(int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void mostrarSubMatriz(int matriz[][], int posFila, int posCol) {
		
		int filaInicio = posFila == 0 ? 0 : -1;
		int filaFinal = posFila == FILAS - 1 ? 0 : 1;
		
		int colInicio = posCol == 0 ? 0 : -1;
		int colFinal = posCol == COLUMNAS - 1 ? 0 : 1;

		for(int i = filaInicio; i <= filaFinal; i++) {
			for(int j = colInicio; j <= colFinal; j++) {
				System.out.print(matriz[posFila + i][posCol + j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void buscarNumero(int matriz[][], int numero) {
		for(int i = 0; i < FILAS; i++) {
			for(int j = 0; j < COLUMNAS; j++) {
				if(matriz[i][j] == numero) {
					mostrarSubMatriz(matriz,i,j);
					break;
				}
			}
		}
		System.out.println("Fin buscar numero");
	}
	
	public static void leerEntradas(int matriz[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un numero ");
		int num = sc.nextInt();
		buscarNumero(matriz, num);
	}
	
	public static int sumarColumna(int matriz[][], int col) {
		int suma = 0;
		for(int i = 0; i < FILAS; i++) {
			suma += matriz[i][col];
		}
		return suma;
	}
	
	public static void leerColumna(int matriz[][]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija una columna ");
		int num = sc.nextInt();
		sumarColumna(matriz, num);
	}
	
	public static void main(String[] args) {
		int matriz[][] = cargarMatriz();
		mostrarMatriz(matriz);
		//leerEntradas(matriz);
		leerColumna(matriz);
	}

}
