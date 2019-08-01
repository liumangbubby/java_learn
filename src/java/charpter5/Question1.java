package charpter5;

public class Question1 {
    public static void main(String[] args) {
        int[] abc = {20, 90, 48, 92};
        int length = abc.length;
        int a = abc[0];
        abc[0] = abc[length - 1];
        abc[length - 1] = a;
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i]);
            System.out.print(",");
        }
    }
}
