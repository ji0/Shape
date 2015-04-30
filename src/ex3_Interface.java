public class ex3_Interface {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Rect rect = new Rect();
		Triangle tri = new Triangle();

		circle.visible(false);
		rect.visible(true);
		tri.visible(true);

		Point pt = new Point(3, 5);
		ColorPoint cpt = new ColorPoint(4, 6, "red");

		pt.draw();
		cpt.draw();
	}

}
