import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Ingresa un texto");
        Scanner sc  = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.print(texto);
    }
}