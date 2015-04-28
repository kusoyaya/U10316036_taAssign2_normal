package assign1;

public class Calculator {
	public static double getCircleArea(double radius){
		double answer=Math.PI * radius *radius;
		return answer;
	}
	
	public static double getCirclePerimeter(double radius){
		double answer = Math.PI * 2 * radius;
		return answer;
	}
	
	public static double getTriangleArea(double button, double height){
		double answer = 0.5*button *height;
		return answer;
	}
	
	public static double getRetangleArea(double sideA, double sideB){
		return sideA*sideB;
	}
	
	public static double getRetangleRound(double sideA,double sideB){
		return 2*(sideA+sideB);
	}
}
