import java.util.Scanner;
public class lineProblem {

	static Double length1, length2;

	public static void length(int x1, int y1, int x2, int y2, int m1, int n1, int m2, int n2) {

		length1 = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		length2 = Math.sqrt(((m2-m1)*(m2-m1)) + ((n2-n1)*(n2-n1)));
	}

	static void compare() {
		int result = length1.compareTo(length2);
			if(result == 0) {
				System.out.println("Line1 and Line2 are equal in Length");
			}else if (result > 0) {
				System.out.println("Line1 is greater than Line2 in Length");
			}else {
				System.out.println("Line1 is less than Line2 in Length");
			}
	}

	public static void main (String[] args) {

		System.out.println("Welcome to Line Comparison Computation Problem");


			Scanner input = new Scanner(System.in);
			System.out.println("Co-ordinates for Line1");
			System.out.println("Enter x1: ");
			int x1 = input.nextInt();
			System.out.println("Enter y1: ");
			int y1 = input.nextInt();
			System.out.println("Enter x2: ");
			int x2 = input.nextInt();
			System.out.println("Enter y2: ");
			int y2 = input.nextInt();

			System.out.println("Co-ordinates for Line1");
			System.out.println("Enter m1: ");
			int m1 = input.nextInt();
			System.out.println("Enter n1: ");
			int n1 = input.nextInt();
			System.out.println("Enter m2: ");
			int m2 = input.nextInt();
			System.out.println("Enter n2: ");
			int n2 = input.nextInt();

			length(x1 ,y1, x2, y2, m1, n1, m2, n2);

			System.out.println("Length of Line1: "+length1);
			System.out.println("Length of Line2: "+length2);

			compare();
	}
}
