public class Circle extends Shape implements Drawable {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	Circle(){
		
	}
	
	Circle(int radius){
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원을 그렸습니다");
	}

	@Override
	public double CalculateArea() {
		
		return 4 / 3 * 3.14 * radius * radius;
	}

	public void visible(boolean a) {

		if(a == true){
			System.out.println("삼각형이 보입니다");
		}else{
			System.out.println("삼각형이 보이지 않습니다.");
		}
		
	}
}
