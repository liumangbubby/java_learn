package charpter5;

public class Question3 {
    public static void main(String[] args) {
         s1:for(int i=2;i<1000;i++){
            for(int n=2;n<i;n++){
                if(i%n==0){
                    continue s1;
                }
            }
            System.out.print(i);
            System.out.print(",");
        }
    }
}
