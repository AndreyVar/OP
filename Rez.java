import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Rez {
	
	private static ArrayList <Abstract_Figure> al= new ArrayList <Abstract_Figure> ();
	
	
	private static Abstract_Figure[] area = new Abstract_Figure[3];

	@SuppressWarnings("")
	public static void main(String[] args) {
		
		Circle c = new Circle(0, 0, 7);
		Tringle t = new Tringle(2, 2, 17, 17);
		Rectangle r = new Rectangle(8, 8, 17 , 15);
	
		System.out.println("Площа круга: " + c.getArea());
		System.out.println("Площа трикутника: " + t.getArea());
		System.out.println("Площа чотирикутника: " + r.getArea());
		
		al.add(0, c);
		al.add(1, t);
		al.add(2, r);
		
		Abstract_Figure figures[] = new Abstract_Figure[5];
		
		figures[0]= new Circle(0, 0, 7);
		figures[1] = new Tringle(2, 2, 17, 17);
		figures[2] = new Rectangle(8, 8, 17 , 15);
		
		figures[1].getArea();
		
		Arrays.sort(figures, new Comparator<Abstract_Figure>(){
			@Override
			public int compare(Abstract_Figure o1, Abstract_Figure o2) {
				
				return 0;
			}
		});
		
		al.toArray(area);
		
		System.out.println("\n" + Arrays.toString(area) + "\n");
	
		System.out.printf("Максимальна площа фігури: " + Rez.figMax(area) + "\n");
		
	}
	private static Abstract_Figure figMax(Abstract_Figure[] fm) {
		Abstract_Figure max = fm[0];
		   for (Abstract_Figure af : fm) {
		      if (af.getArea() > max.getArea()) max = af;
		   }
		   return max;
	}
}