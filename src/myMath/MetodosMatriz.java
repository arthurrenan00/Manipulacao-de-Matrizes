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
	public static boolean isArrayNull(int[][] array) throws myMathExceptions.MatrixNullException { //chamando a classe de exceção pra matriz nula
		if(array == null) { //se a matriz informada for nula, lança a exceção
			throw new myMathExceptions.MatrixNullException("A matriz informada é NULA! Tente novamente!"); //informando o erro
		}
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

	public static boolean isMatrizQuadrada(int[][] array) throws myMathExceptions.MatrixNullException { //chamando a classe de exceção pra matriz nula
		if(array == null) { //se a matriz informada for nula, lança a exceção
			throw new myMathExceptions.MatrixNullException("A matriz informada é NULA! Tente novamente!"); //informando o erro
		}
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

	public static boolean isMatrizDiagonal(int[][] array) throws myMathExceptions.MatrixNullException, myMathExceptions.NonSquareMatrixException { //chamando a classe de exceção pra matriz nula e não quadrada
		if(array == null) { //se a matriz informada for nula, lança a exceção
			throw new myMathExceptions.MatrixNullException("A matriz informada é NULA! Tente novamente!"); //informando o erro
		}
		int i, j;
		if (!isMatrizQuadrada(array)) { //se a matriz NÃO for quadrada, lança o erro
			throw new myMathExceptions.NonSquareMatrixException 
			("A matriz informada não é QUADRADA, então não pode ser diagonal! Informe outra matriz"); //informando o erro
		} else { //se for quadrada, continua o código
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array[0].length; j++) {
					if (i != j && array[i][j] != 0)
						return false;
				}
			}
			return true;
		}
			
		
	}
}
