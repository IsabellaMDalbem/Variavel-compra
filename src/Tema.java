import java.util.Scanner;

public class Tema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione os valores dos produtos:");

        float produto1 = scanner.nextFloat();
        float produto2 = scanner.nextFloat();
        float produto3 = scanner.nextFloat();
        float produto4 = scanner.nextFloat();
        double result = produto1 + produto2 + produto3 + produto4;


        System.out.println("Sua compra de: " + produto1 +  " reais" + ", " + produto2 +  " reais" + ", " + produto3 + " reais" + ", " + produto4 + " reais," +  " fica no valor total de " + result + " reais.");






    }

}
