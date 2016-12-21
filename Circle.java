public class Circle extends Abstract_Figure implements Name{
	
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public float getArea() {
		return (float) (Math.PI * radius * radius);
	}

	@Override
	public String getName() {
		return "Коло";
	}
	
	@Override
	public String toString() {
		return getName() + ", площа = " + getArea();
	}
}
