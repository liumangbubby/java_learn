package charpter4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度：");
        int num = Integer.parseInt(scanner.next());
       for (int j = 0;j<num;j++){
           for(int i = 0;i<num;i++){//i+j>=num/2+1,i-j<=num/2,j-i<=num/2,i+j<=num/2+num
               if(i+j>=num/2&&i-j<=num/2&&j-i<=num/2&&i+j<=num/2+num-1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
