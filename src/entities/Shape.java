package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private String name;
	private Color color;
	
	public Shape() {
		
	}
	
	public Shape(String name, Color color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double area();
}
