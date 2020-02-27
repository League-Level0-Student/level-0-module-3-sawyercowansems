package _99_extra;

public class spudCounter {
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			} else {
				System.out.println(i + " potato, ");
			}
		}
		System.out.println("More");

	}
}
