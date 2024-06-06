package myMathExceptions;

public class PotenciaNegativeExponentException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	//Construtores da classe
	public PotenciaNegativeExponentException() {
		super();
	}

	public PotenciaNegativeExponentException(String message) {
		super(message);
		
	}
}
