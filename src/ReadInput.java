import java.io.IOException;

public class ReadInput {

    public static void main(String[] args) throws IOException {
        System.out.println("Ingresa tu primer byte: ");

        int inByte = System.in.read();
        System.out.println("El pirmer byte que ingresaste: " + (char) inByte);
        System.out.printf("%s: %c.%n", "El pirmer byte que ingresaste ", inByte);
                //format: %s Strings, %c Character, %n line break
    }
}