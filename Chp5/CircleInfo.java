import java.awt.Color;
import java.awt.Graphics;

public class CircleInfo {

	public int radius;
	public int x, y;
	public Color color;

	/**
	 *  Create a CircleInfo with a given location and radius and with a
	 *  randomly selected, semi-transparent color.
	 *  @param  centerX The x coordinate of the center.
	 *  @param  centerY The y coordinate of the center.
	 *  @param  rad 	The radius of the circle.
	 */

	public CircleInfo( int centerX, int centerY, int rad ) {
		x = centerX;
		y = centerY;
		radius = rad;
		int red = (int)(255 * Math.random());
		int green = (int)(255 * Math.random());
		int blue = (int)(255 * Math.random());
		color = new Color(red, green, blue, 100);
	}

	public void draw( Graphics g ) {
		g.setColor( color );
		g.fillOval( x - radius, y - radius, 2 * radius, 2 * radius);
		g.setColor( Color.BLACK );
		g.drawOval( x - radius, y - radius, 2 * radius, 2 * radius);
	}
}
