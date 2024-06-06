package myMathExceptions;

public class MatrixNullException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	//Construtores da classe
	public MatrixNullException() {
		super();
	}

	public MatrixNullException(String message) {
		super(message);
		
	}
}
