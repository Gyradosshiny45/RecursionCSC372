package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion {
	public static int sumUser(List<Integer> numbers) {
		if (numbers.isEmpty()) {
			return 0;
		} else {
			return numbers.get(0) + sumUser(numbers.subList(1, numbers.size()));
		}
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number here : ");
			int number = in.nextInt();
			numbers.add(number);
			System.out.println("You entered a: " + number);

		}

		System.out.println("The sum of your number is: " + sumUser(numbers));

	}

}
