package charpter4;

public class Question5 {
    public static void main(String[] args) {
        int  j = 1 ;
        System.out.println("九九乘法表");
        for(;j<10;j++){
            for(int i =1;i<=j;i++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
