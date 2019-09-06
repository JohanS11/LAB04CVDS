package hangman.model;

public class GameScoreException extends Exception{
	
	public static final String NUMEROS_NO_PUEDEN_SER_NEGATIVOS = "Los numeros no pueden ser negativos.";
	public GameScoreException(String message) {
		super(message);
	}
}
