
public class Point {


	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y=y;
	}
	
	Point(){
		System.out.println("Call Point");
		
	}
	
	public void show(boolean visible){
		if(visible == true){
			System.out.println("좌표 [ x = " + x + ", y = " + y + " ]에 점을 그렸습니다. ");
		}else{
			System.out.println("좌표 [ x = " + x + ", y = " + y + " ]에 점을 지웠습니다. ");
		}
	}
	
	public void show(){
		System.out.println("좌표 [ x = " + x + ", y = " + y + " ]에 점을 그렸습니다. ");
	}

}
