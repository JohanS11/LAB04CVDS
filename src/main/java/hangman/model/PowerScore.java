package hangman.model;

public class PowerScore implements GameScore {

	@Override
	/**
	 * @param int correctCount determina cuantas veces ha acertado el usuario
	 * @param int incorrectCount determina cuantas veces ha fallado el usuario
	 * @pre el puntaje inicia con 0 puntos
	 * @pos el puntaje debe ser menor o igual 500 y mayor o igual 0 
	 * @pos La $i-ésima$ letra correcta se bonifica con $5^i$
	 * @pos Se penaliza con 8 puntos cada letra incorrecta. 
	 * @return int es el puntaje total obtenido por el usuario con los valores especificados
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int cuentaTotal = 0;
		for (int i = 1; i<=correctCount;i++) {
			cuentaTotal+=Math.pow(5.0, (double) i);
		}
		cuentaTotal-= incorrectCount*8;
		if (cuentaTotal <= 0 ) {
			cuentaTotal = 0;
		} else if (cuentaTotal >= 500) {
			cuentaTotal = 500;
		}
		return cuentaTotal;
	}

}
