package charpter3;

public class Question4 {
    public static void main(String[] args) {
        int a = 10;
        a++;
//a=11
        int b = a++;//b=11,a==12

        int c = 13 + (++a);//c=26,a=13

        int d = 0, e = 0;
        d = d == 10 || a++ == 13 ? 10 : 2;//d=10  a=14,先算逻辑运算符
        e = e == 10 && a++ == 13 ? 10 : 2;//e=2

        System.out.println("a="+a+",b="+b+",c="+c+",d="+d+",e="+e);//a=14,b=11,c=26,d=10,e=2
    }
}
