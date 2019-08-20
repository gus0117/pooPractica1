package aplicacion.test;

public class Punto2 {

	private static int N = 10;
	private static int MINIMO = 1;
	private static int MAXIMO = 100;
	
	public static int[] cargarVector() {
		int vector[] = new int[N];
		for(int i = 0; i < N; i++) {
			vector[i] = (int)(Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
		}
		return vector;
	}
	
	public static void mostrarVector(int vector[]) {
		for(int i = 0; i < N; i++) {
			System.out.println(vector[i]);
		}
	}
	
	public static int[] ordenarVector(int vector[]) {
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				if(vector[i] > vector[j]) {
					int numeroAux = vector[i];
					vector[i] = vector[j];
					vector[j] = numeroAux;
				}
			}
		}
		return vector;
	}
	
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static int[] reemplazarPares(int vector[]) {
		for(int i = 0; i < N; i++) {
			if(esPar(vector[i])) {
				vector[i] = 0;
			}
		}
		return vector;
	}
	
	public static int[] modificarImpares(int[] vector) {
		for(int i = 0; i < N; i++) {
			if(!esPar(vector[i])) {
				vector[i] = vector[i] * 2;
			}
		}
		return vector;
	}
	
	public static void estaOrdenado(int vector[]) {
		for(int i = 0; i < N - 1; i++) {
			if(vector[i] > vector[i + 1]) {
				System.out.println("No esta ordenado");
				break;
			}
		}
		System.out.println("Esta Ordenado");
	}

	public static void main(String[] args) {
		
		int vector[] = cargarVector();
		mostrarVector(vector);
		int vector2[] = ordenarVector(vector);
		System.out.println("Vector ordenado");
		mostrarVector(vector2);
		estaOrdenado(vector2);
		int vector3[] = reemplazarPares(vector2);
		mostrarVector(vector3);
		int vector4[] = modificarImpares(vector3);
		mostrarVector(vector4);
	}

}
