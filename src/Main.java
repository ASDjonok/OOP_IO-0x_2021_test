import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println(1);*/
        System.out.print("a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        int a = 1;
        if (a > 0) {
            System.out.println("a > 0");
        } else {
            System.out.println("a <= 0");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(true);
    }
}
