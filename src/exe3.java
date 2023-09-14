import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valor1 = 10;
        float valor2 = 9;
        float valor3 = 5;
        float valor4 = 8;
        float valor5 = 7;
        float valor6 = 10;


        float soma1 = valor1 + valor2 + valor3;
        float soma2 = valor4 + valor5 + valor6;
        float media1 = soma1 / 3;
        float media2 = soma2 / 3;
        float soma3 = media1 + media2;
        float media3 = soma3 / 2;


        System.out.println("Valor da média 7,8,9 é " + media1);
        System.out.println("Valor da média 4,5,6 é " + media2);
        System.out.println("Soma das médias " + soma3);
        System.out.println("Valor da média geral " + media3);
    }
}