import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        int meses;
        int dias;

        System.out.println(idade + " anos em dias: " + idade * 365);

        System.out.println(idade + " anos em meses: " + idade * 12);
    }

}
