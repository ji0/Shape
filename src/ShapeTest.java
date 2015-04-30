import java.awt.Rectangle;

public class ShapeTest {
   public static void main( String[] args) {      
     /* Shape rect = new Rect();
      Shape circle = new Circle();
*/	
	   Circle c = new Circle();
	   Shape s = c;

	   System.out.println(c instanceof Circle);
	   System.out.println(c instanceof Drawable);
	   System.out.println(c instanceof Shape);
	   System.out.println(s instanceof Rect); 
	   System.out.println(c instanceof Circle);


	   Drawable rect = new Rect();
	//   Drawable circle = new Circle();
	   
	   Rect rect2 = new Rect();
	   
	   rect2.draw();
	   rect.draw();
      //circle.draw();
  }
}
