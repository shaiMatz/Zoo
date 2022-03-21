package mobility;

public abstract class Mobile implements Ilocatable {
	private Point location;
	private double totalDistance;

	public Mobile(Point p) {
		this.location = p;
		this.totalDistance = 0;
	}

	public void addTotalDistance(double d) {
		this.totalDistance += d;

	}

	public double calcDistance(Point p) {
		return Math.sqrt(Math.pow(getLocation().getX() - p.getX(), 2) + (Math.pow(getLocation().getY() - p.getY(), 2)));
	}

	public double move(Point p) {
		setLocation(p);
		addTotalDistance(calcDistance(p));
		return (calcDistance(p));
	}

	public Point getLocation() {
		return this.location;
	}

	public boolean setLocation(Point p) {
		this.location = p;
		if (this.location == p)
			return true;
		return false;
	}
}
