import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero da tabuada de 1 a 10: ");
        int numero = scan.nextInt();
        int num = 1;
        for (int i = numero; i >= 1; i--) {
             num = num * i;
        }
        System.out.println(num);
    }
}
