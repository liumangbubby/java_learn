package charpter4;

public class Question2 {
    public static void main(String[] args) {
        for (int a = 100; a < 1000; a++) {
            int a1 = a / 100;
            int a2 = (a % 100) / 10;
            int a3 = a % 10;
            if (a == a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3) {
                System.out.print(a);
                System.out.print(",");
            }
        }
    }
}
