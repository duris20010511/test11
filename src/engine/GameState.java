package engine;

/**
 * Implements an object that stores the state of the game between levels.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public class GameState {

	/** Current game level. */
	private final int level;
	/** Current score. */
	private final int score;
	/** Lives currently remaining. */
	private final int livesRemaining;
	/** Bullets shot until now. */
	private final int bulletsShot;
	/** Ships destroyed until now. */
	private final int shipsDestroyed;

	/**
	 * Constructor.
	 * 
	 * @param level
	 *            Current game level.
	 * @param score
	 *            Current score.
	 * @param livesRemaining
	 *            Lives currently remaining.
	 * @param bulletsShot
	 *            Bullets shot until now.
	 * @param shipsDestroyed
	 *            Ships destroyed until now.
	 */
	public GameState(final int level, final int score,
			final int livesRemaining, final int bulletsShot,
			final int shipsDestroyed) {
		this.level = level;
		this.score = score;
		this.livesRemaining = livesRemaining;
		this.bulletsShot = bulletsShot;
		this.shipsDestroyed = shipsDestroyed;
	}

	/**
	 * @return the level
	 */
	public final int getLevel() {
		return level;
	}

	/**
	 * @return the score
	 */
	public final int getScore() {
		return score;
	}

	/**
	 * @return the livesRemaining
	 */
	public final int getLivesRemaining() {
		return livesRemaining;
	}

	/**
	 * @return the bulletsShot
	 */
	public final int getBulletsShot() {
		return bulletsShot;
	}

	/**
	 * @return the shipsDestroyed
	 */
	public final int getShipsDestroyed() {
		return shipsDestroyed;
	}

}
