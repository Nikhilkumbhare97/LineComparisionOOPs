import java.util.Scanner;
public class lineProblem {

	static double length1;

	public static double length(int x1, int y1, int x2, int y2) {

		length1 = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));

		return length1;
	}

	public static void main (String[] args) {

		System.out.println("Welcome to Line Comparison Computation Problem");

			int x1, y1, x2, y2;

			Scanner input = new Scanner(System.in);
			System.out.println("Co-ordinates for Line1");
			System.out.println("Enter x1: ");
			x1 = input.nextInt();
			System.out.println("Enter y1: ");
			y1 = input.nextInt();
			System.out.println("Enter x2: ");
			x2 = input.nextInt();
			System.out.println("Enter y2: ");
			y2 = input.nextInt();

			length(x1 ,y1, x2, y2);

			System.out.println("Length of Line1: "+length1);
	}
}
