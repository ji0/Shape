
public class ColorPoint extends Point{
	
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show(){
		System.out.println("좌표 [ x = " + getX() + ", y = " + getY() + ", Color = " + getColor()+ " ]에 점을 그렸습니다. ");
	}
	
	ColorPoint(){
		
	}
	public ColorPoint(int x, int y, String color){
		super(x, y);
		
		this.color = color;
		
	}
	
}
