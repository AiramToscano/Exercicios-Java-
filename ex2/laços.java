import java.util.Scanner;

public class laços {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
         System.out.println("Digite o primeiro numero 1: ");
         int numero1 = scan.nextInt();
         System.out.println("Digite o primeiro numero 2: "); 
         int numero2 = scan.nextInt();
         if( numero1 > numero2 ) {
             System.out.println("O numero 1 é maior: " + numero1);
         }
         else {
           System.out.println("O numero 2 é maior: " + numero2);
         }
    }
}
