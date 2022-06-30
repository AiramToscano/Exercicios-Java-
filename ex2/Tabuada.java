import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero da tabuada de 1 a 10: ");
        int numero = scan.nextInt();
        while (numero < 1 || numero > 10) {
            System.out.println("Porfavor digite um numero de 1 a 10: ");
            numero = scan.nextInt();
        }
        System.out.println("A tabuada do numero é: " + numero);
        for(int i = 0; i <= 10; i++) {
            int num = numero * i;
            System.out.println(numero + " * " + i + " = " + num);
        }
    }
}
