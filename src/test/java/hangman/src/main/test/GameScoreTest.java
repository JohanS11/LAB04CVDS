package hangman.src.main.test;

import static org.junit.Assert.*;

import org.junit.Test;
import hangman.model.*;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import junit.framework.Assert;

/**
 * 
 * @author 2146195
 * @author 2145271
 * 
 * OriginalCase:
 * 		Si acertó 3 veces y fallo 4 veces debería tener 60 puntos
 *		Si acertó 2 veces y fallo 10 veces debería tener 0 puntos
 *		Si acertó 1 veces y fallo 11 veces debería tener 0 puntos
 *		Si acertó 7 veces y fallo 0 veces debería tener 100 puntos
 *
 * BonusCase:
 *		Si acertó 6 veces y fallo 3 veces debería tener 45 puntos
 *		Si acertó 0 veces y fallo 10 veces debería tener 0 puntos
 *		Si acertó 3 veces y fallo 11 veces debería tener 0 puntos
 *		Si acertó 5 veces y fallo 9 veces debería tener 5 puntos
 * PowerBonusCase:
 *		Si acertó 6 veces y fallo 3 veces debería tener 19506 puntos
 *		Si acertó 0 veces y fallo 10 veces debería tener 0 puntos
 *		Si acertó 3 veces y fallo 11 veces debería tener 67 puntos
 *		Si acertó 5 veces y fallo 9 veces debería tener 3833 puntos
 */
public class GameScoreTest {

	@Test
	public void OriginalCase() throws GameScoreException {
		GameScore juego = new OriginalScore();
		Assert.assertEquals(juego.calculateScore(3, 4), 60);
		Assert.assertEquals(juego.calculateScore(2, 10), 0);
		Assert.assertEquals(juego.calculateScore(1, 11), 0);
		Assert.assertEquals(juego.calculateScore(7, 0), 100);
	}
	
	@Test
	public void BonusCase() throws GameScoreException {
		GameScore juego = new BonusScore();
		Assert.assertEquals(juego.calculateScore(6, 3), 45);
		Assert.assertEquals(juego.calculateScore(0, 10), 0);
		Assert.assertEquals(juego.calculateScore(3, 11), 0);
		Assert.assertEquals(juego.calculateScore(5, 9), 5);
	}
	@Test
	public void PowerBonusCase() throws GameScoreException {
		GameScore juego = new PowerScore();
		Assert.assertEquals(juego.calculateScore(6, 3), 500);
		Assert.assertEquals(juego.calculateScore(0, 10), 0);
		Assert.assertEquals(juego.calculateScore(3, 11), 67);
		Assert.assertEquals(juego.calculateScore(5, 9), 500);
	}

}
