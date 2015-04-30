public class ColorPoint extends Point {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	ColorPoint() {

	}

	
	public void draw(){
		System.out.println("좌표 [ x = " + getX() + ", y = " + getY()
				+ ", Color = " + getColor() + " ]에 점을 그렸습니다. ");
		
		
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);

		this.color = color;

	}

}
