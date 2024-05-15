package myMath;

public class MetodosMatriz {

	/**
	 * Método de verificação de uma matriz nula.
	 * @author Arthur Renan
	 * @param array 
	 * 				Variável de um array bidimensional inteiro a ser recebida para usar na função.
	 * @return 
	 * 			double - retorna "false" se a matriz NÃO for nula;
	 * 			double - retorna "true" se a matriz FOR nula.
	 * @since 1.1
	 */
	public static boolean isArrayNull(int[][] array) {
		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				if (array[i][j] != 0)
					return false;
			}
		}
		return true;
	}
	
	/**
	 * Método de verificação de uma matriz quadrada.
	 * @author Arthur Renan
	 * @param array
	 * 				Variável de um array bidimensional inteiro a ser recebida para usar na função.
	 * @return 
	 * 			double - retorna "false" se a matriz NÃO FOR quadrada;
	 * 			double - retorna "true" se a matriz FOR quadrada;
	 */

	public static boolean isMatrizQuadrada(int[][] array) {
		int numLinhas = array.length;
		int numColunas = array[0].length;
		if (numLinhas != numColunas) {
			return false;
		}
		return true;
	}
	
	/**
	 * Método de verificação de uma matriz diagonal.
	 * @author Arthur Renan
	 * @param array
	 * 				Variável de um array bidimensional inteiro a ser recebida para usar na função.
	 * @return
	 * 			double - retorna "false" se a matriz NÃO FOR diagonal;
	 * 			double - retorna "false" se a matriz NÃO FOR quadrada, pois matrizes diagonais DEVEM ser 
	 * quadradas;
	 * 			double - retorna "true" se a matriz FOR diagonal.
	 */

	public static boolean isMatrizDiagonal(int[][] array) {
		int i, j;
		if (isMatrizQuadrada(array)) {
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array[0].length; j++) {
					if (i != j && array[i][j] != 0)
						return false;
				}
			}
		} else
			return false;
		return true;
	}
}
