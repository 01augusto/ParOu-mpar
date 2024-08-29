import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");

        Integer numero = scanner.nextInt();

        //Parte 2 das porcentagens.
        if (numero % 2 == 0){

            System.out.println("Par");
        } else if (numero % 2 == 1) {

            System.out.println("Ímpar");
        }


    }

}