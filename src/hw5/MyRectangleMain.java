package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle rect = new MyRectangle();
		rect.setWidth(10);
		rect.setDepth(20);
		System.out.println(rect.getArea());
		MyRectangle rect1 = new MyRectangle(10, 20);
		System.out.println(rect1.getArea());
	}
}