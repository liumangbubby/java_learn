package charpter5;

public class Question2 {
    public static void main(String[] args) {
        double[] str = {4,5.5,6,7.7};
        int length = str.length;
        for(int i=0;i<length/2;i++){
            double a = str[i];
            str[i] = str[length - 1 - i];
        }
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i]);
            System.out.print(",");
        }
    }
}
