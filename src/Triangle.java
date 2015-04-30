
public class Triangle extends Shape implements Drawable{

	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그렸습니다.");
		
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return height*width/2;
	}
	@Override
	public void visible(boolean a) {
		// TODO Auto-generated method stub
	
		if(a == true){
			System.out.println("삼각형이 보입니다");
		}else{
			System.out.println("삼각형이 보이지 않습니다.");
		}
	}
	
	
	
}
