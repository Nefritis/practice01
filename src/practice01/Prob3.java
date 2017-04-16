package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		int number = scanner.nextInt();
		int odd=0;
		int even=0;

		if (number % 2 == 1) {
			for (int i = 1; i <= number; i += 2) {
				if (i != number) {
					odd = odd + i;
					System.out.print(i + " ");
				} else {
					odd = odd + i;
					System.out.println(i + "\n");
				}
			}
			System.out.println("결과값  : " + odd);

		} else {
			for (int i = 0; i <= number; i += 2) {
				if (i != number) {
					even = even + i;
					System.out.print(i + " ");
				} else {
					even = even + i;
					System.out.println(i + "\n");
				}
			}
			System.out.println("결과값 : " + even);
		}

		scanner.close();
	}
}
