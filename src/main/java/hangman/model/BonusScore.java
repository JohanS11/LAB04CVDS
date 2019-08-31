package hangman.model;

public class BonusScore implements GameScore {

	@Override
	/**
	 * @param int correctCount determina cuantas veces ha acertado el usuario
	 * @param int incorrectCount determina cuantas veces ha fallado el usuario
	 * @pre el puntaje inicia con 0 puntos
	 * @pos el puntaje debe ser mayor o igual 0 
	 * @return int es el puntaje total obtenido por el usuario con los valores especificados
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int cuentaTotal = correctCount*10-incorrectCount*5;
		if (cuentaTotal <= 0) {
			cuentaTotal = 0;
		}
		
		return cuentaTotal;
	}

}
