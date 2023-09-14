import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int valor = 10; //declarei uma variável
        System.out.println("Variável do tipo int " + valor );

        byte bye = 127;
        System.out.println("Variável do tipo byte " + bye );


        short sim = 20;
        System.out.println("Variável do tipo short "+ sim );

        long nao = 30;
        System.out.println("Variável do tipo long " + nao );

        boolean positivo = true;
        System.out.println("Variável do tipo boolean " + positivo );

        char negativo = 'i';
        System.out.println("Variável do tipo char " + negativo );

        String hello = "duda123";
        System.out.println("Variável do tipo string " + hello );


        float oi = 3.15f;
        System.out.println("Variável do tipo float " + oi );

        double tchau = 3.1456789;
        System.out.println("Variável do tipo double " + tchau );




        int num1 = 57;
        int num2 = 10;

        int soma = num1+num2;
        System.out.println("A soma de " +num1+ " e " +num2+ " é igual a " +soma);


                Scanner scanner = new Scanner(System.in);

                int numero1  = scanner.nextInt();
                int numero2  = scanner.nextInt();
                int soma2 = numero1 + numero2;

                scanner.close();


                System.out.println("A soma de " +numero1+ " e " +numero2+ " resulta em " +soma2);




        //Soma
        int valor7;
        int valor8;

        System.out.println("Insira o valor7: ");
        valor7 = scanner.nextInt();
        System.out.println("Insira o valor8: ");
        valor8 = scanner.nextInt();

        int adicao;
        adicao = valor7 - valor8;
        System.out.println("a soma é: " + adicao);






                        //Subtração
        int valor1;
        int valor2;

        System.out.println("Insira o valor1: ");
        valor1 = scanner.nextInt();
        System.out.println("Insira o valor2: ");
        valor2 = scanner.nextInt();

        int subtracao;
        subtracao = valor1 - valor2;
        System.out.println("a subtração é: " + subtracao);






        //Multiplicação
        int valor3;
        int valor4;

        System.out.println("Insira o valor3: ");
        valor3 = scanner.nextInt();
        System.out.println("Insira o valor4: ");
        valor4 = scanner.nextInt();

        int multip;
        multip = valor3 * valor4;
        System.out.println("a multiplicação é: " + multip);







        //Divisão
        int valor5;
        int valor6;

        System.out.println("Insira o valor5: ");
        valor5 = scanner.nextInt();
        System.out.println("Insira o valor6: ");
        valor6 = scanner.nextInt();

        int divisao;
        divisao = valor5 / valor6;
        System.out.println("a divisão é: " + divisao);


    }


}