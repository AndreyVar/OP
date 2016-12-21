public abstract class Abstract_Figure{
	
	private int x, y;
	
	public Abstract_Figure(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract float getArea();
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
}
