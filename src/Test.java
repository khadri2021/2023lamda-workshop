import java.util.Scanner;
import java.util.function.Predicate;

public class Test {
	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = (age) -> {
			if (age >= 18) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println("Please Enter Your Age : ");

		boolean test = predicate.test(sc.nextInt());
		if (test) {
			System.out.println("You Are Eligible For Vote. Because Your Age Is Greater Than 17 Years.");
		} else {
			System.out.println("You Are Not Eligible For Vote. Because Your Age Is Less Than 18 Years.");
		}
	}
}