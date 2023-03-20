import java.util.Scanner;

public class CalculadoraCambiosAcciones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el símbolo de la acción: ");
        String symb =  sc.nextLine();
        System.out.printf("Ingresa el valor de %s el día 1 ", symb);
        double day1 = sc.nextDouble();
        System.out.printf("Ingresa el valor de %s el día 2 ", symb);
        double day2 = sc.nextDouble();
        double opday = day2 - day1;
        System.out.printf("El valor de %s ha cambiado un %f en un día", symb, opday);
    }
}