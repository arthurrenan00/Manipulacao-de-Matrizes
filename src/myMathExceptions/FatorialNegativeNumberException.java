package myMathExceptions;

public class FatorialNegativeNumberException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	//Construtores da classe
	public FatorialNegativeNumberException() {
		super();
	}

	public FatorialNegativeNumberException(String message) {
		super(message);
		
	}
}
