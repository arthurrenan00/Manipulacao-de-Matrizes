package myMath;

public class MetodosMatriz {

	public static boolean isArrayNull(int[][] array){
		int i, j;
		for(i=0;i< array.length;i++){
			for(j=0;j< array[i].length;j++){
				if(array[i][j] != 0) 
					return false;
			}
		}
		return true;
	}
	
	public static boolean isMatrizQuadrada(int[][] array){
		int numLinhas = array.length;
		int numColunas = array[0].length;
		if(numLinhas != numColunas){
			return false;
		} 
		return true;
	}
	
	public static boolean isMatrizDiagonal(int[][] array){
		int i,j;
		if(isMatrizQuadrada(array)){
			for(i=0;i<array.length;i++){
				for(j=0;j<array[0].length;j++){
					if(i!=j && array[i][j] != 0)
						return false;
				}
			}
		} else return false;
		return true;
	}
}
