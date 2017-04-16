package practice01;

public class Prob5 {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int rest = i % 10;
			int ten = i / 10;
			
			
			
			if ((rest == 3) || (rest == 6) || (rest == 9)) {
					System.out.print("짝 ");
			if ((ten == 3) || (ten == 6) || (ten == 9)) {
					System.out.print("짝 ");
				}
			}
			System.out.println(i + " ");
		}
	}
}