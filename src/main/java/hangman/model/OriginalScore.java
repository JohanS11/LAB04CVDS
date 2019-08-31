package hangman.model;

public class OriginalScore implements GameScore {

	@Override
	/**
	 * @param int correctCount determina cuantas veces ha acertado el usuario
	 * @param int incorrectCount determina cuantas veces ha fallado el usuario
	 * @pre el puntaje inicia con 100 puntos
	 * @pos el puntaje debe ser mayor o igual 0 
	 * @pos No se bonifican las letras correctas
	 * @pos Se penaliza con 10 puntos con cada letra incorrecta.
	 * @return int es el puntaje total obtenido por el usuario con los valores especificados
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int cuentaTotal = 100-incorrectCount*10;
		if (cuentaTotal <= 0) {
			cuentaTotal = 0;
		}
		return cuentaTotal;
	}
	
}
