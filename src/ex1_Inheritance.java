
public class ex1_Inheritance {
	
	
	public static void main(String[] args) {
		
		
		Circle circle = new Circle();
		circle.setRadius(5); 
		System.out.println("만들어진 원의 넓이는 " + circle.CalculateArea());
		
		Rect rect = new Rect();
		rect.setHeight(6);
		rect.setWidth(7);
		System.out.println("만들어진 원의 넓이는 " + rect.CalculateArea());
		
		Triangle tri = new Triangle();
		tri.setHeight(3);
		tri.setWidth(12);
		System.out.println("만들어진 원의 넓이는 " + tri.CalculateArea());
		
	
	}

}
