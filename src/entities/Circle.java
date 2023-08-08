package entities;

public class Circle implements Shape{
	
	private Double radius;

	public Circle(Double rarius) {
		super();
		this.radius = rarius;
	}

	public Double getRarius() {
		return radius;
	}

	public void setRarius(Double rarius) {
		this.radius = rarius;
	}

	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
	

}
