
public class ex2_Overloading {

	public static void main(String[] args) {
	
		
		
		
		Circle circle = new Circle();
		circle.setRadius(4);
		
		Circle circle2 = new Circle(5);
		
		System.out.println("원의 반지름은 " + circle.getRadius());
		System.out.println("원의 반지름은 " + circle2.getRadius());
	
	}

}
