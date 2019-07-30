package charpter4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入给定的数字：");
        String str = scanner.next();
        int num = Integer.parseInt(str);
        int s = num%2;
        if(s == 1){
            System.out.println("是奇数");
        }else{
            System.out.println("是偶数");
        }
    }
}