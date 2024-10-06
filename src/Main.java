import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j = 1;

        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {

            System.out.println(j *= i);
        }

    }
}