import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora cal = new Calculadora();

        System.out.print("1.Suma \n2.Resta  \n3.Multiplicación \n4.División \nEliga una opción:");
        int option = sc.nextInt();
        double variablex;
        double variabley;

        switch (option){
            case 1:
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Suma(variablex,variabley));
                break;

            case 2:
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Resta(variablex,variabley));
                break;

            case 3:
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Multiplicacion(variablex,variabley));
                break;

            case 4:
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Division(variablex,variabley));
                break;

            default:
                System.out.print("Esta opción no es valida intente ingresar otra");
        }

    }
}