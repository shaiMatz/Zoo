package animals;

import diet.IDiet;
import food.IEdible;
import mobility.Mobile;
import mobility.Point;

public abstract class Animal extends Mobile implements IEdible {
	private String name;
	private double weight;
	private IDiet diet;

	public Animal(String name, Point location) {
		super(location);
		this.name = name;
	}

	public abstract void makeSound();

	public abstract boolean eat(IEdible ed);
}
