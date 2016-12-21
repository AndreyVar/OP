public class Rectangle extends Abstract_Figure implements Name{
	
	private int a, b;

	public Rectangle(int x, int y, int a, int b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}

	public float getArea() {
		return a * b;
	}

	@Override
	public String getName() {
		return "Чотирикутник";
	}
	
	@Override
	public String toString() {
		return getName() + ", площа = " + getArea();
	}
	
}
