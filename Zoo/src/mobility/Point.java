package mobility;

public class Point {
	private int x;
	private int y;

	static private final int xMax = 800;
	static private final int yMax = 800;
	
	public Point(int x, int y) {
		if(0<x && x<xMax)
			this.x=x;
		if(0<y && x<yMax)
			this.y=y;
	}
	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}
}
s