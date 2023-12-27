package Java_IV_Q;

public class Num_Prime_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}

			if (count == 2) {
				System.out.println("Prime number");
			} else {
				System.out.println("Not Prime number");
			}
		} else {
			System.out.println("Not Prime number");
		}

	}

}
