public class Tringle extends Abstract_Figure implements Name{
	
	private int a, h;

	public Tringle(int x, int y, int a, int h) {
		super(x, y);
		this.a = a;
		this.h = h;
	}

	public float getArea() {
		return 0.5f * a * h;
	}

	@Override
	public String getName() {
		return "Трикутник";
	}
	
	@Override
	public String toString() {
		return getName() + ", площа = " + getArea();
	}
	
}
