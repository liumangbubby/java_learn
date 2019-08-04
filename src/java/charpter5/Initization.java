package charpter5;

public class Initization {
    int i = -1;
    static {
        System.out.println("static init");
    }
    {
        System.out.println("i:" + i);
        System.out.println("init");
        i = 1;
    }

    public Initization() {
        System.out.println("i:" + i);
        System.out.println("constructor init");
        i = 100;
    }

    public static void main(String[] args) {
        Initization z = new Initization();
        System.out.println("z.i:" + z.i);
        System.out.println();
        Initization a = new Initization();
        System.out.println("a.i:" + a.i);
    }
}
