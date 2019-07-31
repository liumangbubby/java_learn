package charpter5;

import java.util.Arrays;

public class Question2Swap {
    public static void main(String[] args) {
        double[] str = {4,5.5,6,7.7};
        for (int i = str.length; i > str.length / 2; i--) {
            double temp = str[i - 1];
            str[i - 1] = str[str.length - i];
            str[str.length - i] = temp;
        }
        System.out.println(Arrays.toString(str));
    }
}
