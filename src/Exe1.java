import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O NÚMERO: ");
        int um = scanner.nextInt();

        if (um % 2 == 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar");
        }
    }
}
