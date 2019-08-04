package charpter5;

public class Initization {
    static {
        System.out.println("static init");
    }
    {
        System.out.println("init");
    }

    public Initization() {
        System.out.println("constructor init");
    }

    public static void main(String[] args) {
        Initization z = new Initization();
        Initization a = new Initization();
    }
}
