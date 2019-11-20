package id.ac.its.waldo.movingsprites;
import java.util.Random;
public class Asteroid extends Sprite{
	public Asteroid (int x, int y) {
		super(x, y);
		initAsteroid();
	}
	private void initAsteroid() {
		loadImage("src/resources/asteroid.png");
		getImageDimensions();
	}
	public void floating() {
		Random rand = new Random();
		int z = rand.nextInt(100);
		if(z == 0) x++;
		if(z == 1) x--;
		if(z == 2) y++;
		if(z == 3) y--;
	}
}
