package myMathExceptions;

public class NonSquareMatrixException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	//Construtores da classe
	public NonSquareMatrixException() {
		super();
	}

	public NonSquareMatrixException(String message) {
		super(message);
		
	}

}
