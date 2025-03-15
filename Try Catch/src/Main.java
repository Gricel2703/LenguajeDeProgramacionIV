import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora cal = new Calculadora();

        int num = 0;

        System.out.print("1.Suma \n2.Resta  \n3.Multiplicación \n4.División \n5.Perímetro \n6.Circunferencia \n7.Radio \nEliga una opción:");
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        double variablex;
        double variabley;
        double variablez;

        if (num == 1) {
            try {
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Suma(variablex, variabley));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else if (num == 2) {
            try {
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Resta(variablex, variabley));
            } catch(Exception e){
                System.out.println(e.getMessage());
            }


        } else if (num == 3) {
            try {
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Multiplicacion(variablex, variabley));
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        } else if (num == 4) {
            try {
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Resultado es igual a: " + cal.Division(variablex, variabley));
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        } else if (num == 5) {
            try {
                System.out.print("Ingrese primer número: ");
                variablex = sc.nextDouble();
                System.out.print("Ingrese segundo número: ");
                variabley = sc.nextDouble();
                System.out.print("Ingrese tercer número: ");
                variablez = sc.nextDouble();
                System.out.print("Perímetro es igual a: " + cal.Perimetro(variablex, variabley, variablez));
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        } else if (num == 6) {
            try {
                System.out.print("Ingrese número: ");
                variablex = sc.nextDouble();
                System.out.print("Circunferencia es igual a: " + cal.Circunferencia(variablex));
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        } else if (num == 7) {
            try {
                System.out.print("Ingrese número: ");
                variablex = sc.nextDouble();
                System.out.print("Radio es igual a: " + cal.Radio(variablex));
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        } else {
            System.out.print("Esta opción no es valida intente ingresar otra");
        }
    }
}