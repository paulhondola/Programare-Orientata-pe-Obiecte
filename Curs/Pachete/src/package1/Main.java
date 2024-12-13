package package1;
import package2.Idk2;

public class Main {
    public static void main(String[] args) {
        Idk idk = new Idk();
        Idk2 idk2 = new Idk2();
        idk.main(args);
        idk2.main(args);
        System.out.println("Hello, World!");
    }
}