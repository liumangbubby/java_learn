package charpter4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入给定的字符：");
    String str = scanner.nextLine();
    int length = str.length();
    int z = 0;//字母的数量
        int s = 0;//数字的数量
        int k = 0;//空格的数量
        int q =0;//其他的数量
        for(int a = 0;a<length;a++){
           if(Character.isLetter(str.charAt(a))){//判斷是否是字母
               z++;
           }else if (Character.isDigit(str.charAt(a))){//判断是否为数字
               s++;
           }else if(Character.isSpaceChar(str.charAt(a))){//判断是否为空格
               k++;
           }else{//则为其他字符
               q++;
           }
        }
        System.out.println("字母的数目为："+z);
        System.out.println("数字的数目为："+s);
        System.out.println("空格的数目为："+k);
        System.out.println("其他字符的数目为："+q);
    }
}
