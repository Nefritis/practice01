package practice01;

public class Prob2 {
	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			for (int j = i; j <= 9 + i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}