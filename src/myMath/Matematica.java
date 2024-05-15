package myMath;

//import myMath.MetodosMatriz;

/**
 * Biblioteca com metótos matematicos úteis
 * 
 * @version 2.0
 */
public class Matematica {

	/**
	 * Metodo recursivo para o calculo de potências, calcula x elevado a n
	 * 
	 * @author Emerson A. Silva
	 * @param x
	 *            Representa a base da potencia
	 * @param n
	 *            Representa o expoente da potencia
	 * @return double - resultado de x elevado a n
	 * @since 1.1
	 */
	public static double potencia(float x, int n) {
		if (n == 0)
			return (float) 1.0;
		else
			return x * potencia(x, n - 1);
	}

	/**
	 * Metodo recursivo para o calculo de potências, calcula x elevado a n
	 * 
	 * @author Emerson A. Silva
	 * @param x
	 *            Double representa a base da potencia
	 * @param n
	 *            Representa o expoente da potencia
	 * @return double - resultado de x elevado a n
	 * @since 1.1
	 */
	public static double potencia(double x, int n) {
		if (n == 0)
			return (float) 1.0;
		else
			return x * potencia(x, n - 1);
	}

	/**
	 * Metodo recursivo para o cálculo do fatorial de um número n
	 * 
	 * @author Emerson A. Silva
	 * @param n
	 *            Número que queremos calcular o fatorial
	 * @return long com o resultado do fatorial de n ( n!)
	 * @since 1.0
	 */
	public static long fatorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * fatorial(n - 1);
	}

	/**
	 * Calcula o enéssimo elemento da sequencia de fibonacci
	 * 
	 * @param n
	 *            - Enésimo elemento da sequencia de fibonacci
	 * @return - long com o valor do enéssimo elemento da sequencia de fibonacci
	 * @since 2.0-
	 */
	public static long fibonacci(int n) {
		long numFib; // arrumar a formula!!
		if (n == 2)
			return 1;
		else {
			numFib = (long) (1 / Math.sqrt(5) * potencia((1 + Math.sqrt(5)) / 2, n)
					- 1 / Math.sqrt(5) * potencia((1 - Math.sqrt(5)) / 2, n));
			return numFib;
		}
	}

	/**
	 * Verifica se um numero é um quadrado perfeito
	 * 
	 * @param numero
	 *            inteiro para ser testado
	 * @return boolean true se o numero é um quadrado perfeito
	 * @since 2.0
	 */
	public static boolean isPerfectQuad(int numero) {
		int quadrado;
		quadrado = (int) Math.sqrt(numero);

		return (quadrado * quadrado == numero);
	}

	/**
	 * Verifica se um número pertence a sequencia de fibonacci
	 * 
	 * @param num
	 *            - numero inteiro a ser verificado
	 * @return boolean - true se o numero pertence a sequencia de fibonacci
	 */
	public static boolean isFiboNumber(int num) {

		return isPerfectQuad(5 * (num * num) + 4) || isPerfectQuad(5 * (num * num) - 4);
	}

	public static void main(String[] args) {
		
		// matriz nula
		int[][] matriz = { { 1, 1 }, { 0, 3 } };
		int[][] zero1 = { { 0, 0 }, { 0, 0 } };
		System.out.println(myMath.MetodosMatriz.isArrayNull(matriz)); // não nula
		System.out.println(myMath.MetodosMatriz.isArrayNull(zero1)); // nula
		System.out.println("\n");
		// matriz quadrada
		int[][] matrizQuad = { { 1, 1 }, { 0, 3 } };
		int[][] matrizNaoQuad = { { 1, 3, 2 }, { 1, 2 } };
		System.out.println(myMath.MetodosMatriz.isMatrizQuadrada(matrizQuad)); //quadrada
		System.out.println(myMath.MetodosMatriz.isMatrizQuadrada(matrizNaoQuad)); // não é quadrada
		System.out.println("\n");
		//matriz diagonal
		int[][] matrizDiag = {{1,0,0},{0,1,0},{0,0,1}};
		int[][] matrizNaoDiag = {{1,3,0},{0,1,0},{0,0,1}};
		System.out.println(myMath.MetodosMatriz.isMatrizDiagonal(matrizNaoQuad)); //não é quadrada
		System.out.println(myMath.MetodosMatriz.isMatrizDiagonal(matrizNaoDiag)); //é quadrada mas não é diagonal
		System.out.println(myMath.MetodosMatriz.isMatrizDiagonal(matrizDiag)); //é diagonal



	}

}
