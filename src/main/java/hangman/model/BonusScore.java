package hangman.model;

public class BonusScore implements GameScore {

	@Override
	/**
	 * @param int correctCount determina cuantas veces ha acertado el usuario
	 * @param int incorrectCount determina cuantas veces ha fallado el usuario
	 * @pre el puntaje inicia con 0 puntos
	 * @pos el puntaje debe ser mayor o igual 0 
	 * @pos Se bonifica con 10 puntos cada letra correcta.
	 * @pos Se penaliza con 5 puntos cada letra incorrecta
	 * @return int es el puntaje total obtenido por el usuario con los valores especificados
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
		int cuentaTotal = correctCount*10-incorrectCount*5;
		if (cuentaTotal <= 0) {
			throw new GameScoreException(GameScoreException.NUMEROS_NO_PUEDEN_SER_NEGATIVOS);
		}
		
		return cuentaTotal;
	}

}
