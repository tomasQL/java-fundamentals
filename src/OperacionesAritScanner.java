import java.util.Scanner;

public class OperacionesAritScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int x = sc.nextInt();
        System.out.println("Ingresa un segundo numero: ");
        int y = sc.nextInt();
        System.out.println("La suma de ambos numeros es = " + (x + y));
    }
}