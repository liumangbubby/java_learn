package charpter4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度：");
        String str = scanner.next();
        int num = Integer.parseInt(str);
        int b = num / 2;
        int d = 1;
        for (int a = 1; a <= num / 2; a++) {//上半部分
            for (int c = b; c > 0; c--) {
                System.out.print(" ");
            }
            for (int e = d; e > 0; e--) System.out.print("*");
            b--;
            d += 2;
            System.out.println();
        }
        for (int s = num; s > 0; s--) {//中间一排
            System.out.print("*");
        }
        System.out.println();
        for(int g = 1;g <=num/2;g++){//下半部分
            for(int m = g;m>0;m--){
                System.out.print(" ");
            }
            for(int x = num-g*2;x>0;x--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
