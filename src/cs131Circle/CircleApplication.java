package cs131Circle;

public class CircleApplication {

	public static void main(String[] args) {
		Circle myCircle=new Circle(2.2);
		double radius=myCircle.getRadius();
		System.out.println("The radius is: "+radius);
		System.out.println("The area is: "+myCircle.calculateArea(radius));
	}

}
