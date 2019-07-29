package charpter3;

public class Question3 {
	public static void main(String[] args) {
		int a = 9527;
		int c = 1;
		for (int b = a; b > 10; b /= 10) {
			c *= 10;
		}
		for (; c > 0; c /= 10) {
			int d = a;
			d /= c;
			String str = "" + d;
			System.out.print(" " + str);
			a %= c;
		}

	}
}