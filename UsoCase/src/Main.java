import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Multiplicación \n2. Suma \n3. Resta \n4. División \nIngrese selección de operación deseada: ");
        int option = sc.nextInt();
        switch (option) {
            //En este caso se piden dos números para realizar una multiplicación
            case 1:
                System.out.print("Ingrese primer número: ");
                int a = sc.nextInt();
                System.out.print("Ingrese segundo número: ");
                int b = sc.nextInt();
                System.out.print("Resultado: ");
                int resultado = (int) a * b;
                System.out.print(resultado);
                break;
                //En este caso se piden dos números para realizar una suma
            case 2:
                System.out.print("Ingrese primer número: ");
                int x = sc.nextInt();
                System.out.print("Ingrese segundo número: ");
                int y = sc.nextInt();
                System.out.print("Resultado: ");
                int result = (int) x + y;
                System.out.print(result);
                break;
                //En esta caso esta pidiendo dos variables para realizar una resta
            case 3:
                System.out.print("Ingrese primer número: ");
                int l = sc.nextInt();
                System.out.print("Ingrese segundo número: ");
                int k = sc.nextInt();
                System.out.print("Resultado: ");
                int resul = (int) l - k;
                System.out.print(resul);
                break;
            //En esta caso esta pidiendo dos variables para realizar una división
            case 4:
                System.out.print("Ingrese primer número: ");
                int h = sc.nextInt();
                System.out.print("Ingrese segundo número: ");
                int i = sc.nextInt();
                System.out.print("Resultado: ");
                int resu = (int) h / i;
                System.out.print(resu);
                break;
        }
    }
}