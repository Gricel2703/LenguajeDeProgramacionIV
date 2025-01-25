import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Multiplicación \n2. Suma \n3. Resta \n4. División \nIngrese selección de operación deseada:");
        int num = sc.nextInt();

        if (num==1){//En este bloque al ser seleccionada la opción uno se realiza una multiplicación, en donde establamos dos variables enteras para que pueda realizar la operación y a su vez hacemos que los imprima, en donde determinamos otra variable para que nos de el resultado y nos lo imprima
            System.out.print("Ingrese primer número: ");
            int a = sc.nextInt();
            System.out.print("Ingrese segundo número: ");
            int b = sc.nextInt();
            System.out.print("Resultado: ");
            int resultado=(int) a*b;
            System.out.print(resultado);
        }
        else if (num==2){//En este bloque al ser seleccionada la opción uno se realiza una multiplicación, en donde establamos dos variables enteras para que pueda realizar la operación y a su vez hacemos que los imprima, en donde determinamos otra variable para que nos de el resultado y nos lo imprima
            System.out.print("Ingrese primer número: ");
            int a = sc.nextInt();
            System.out.print("Ingrese segundo número: ");
            int b = sc.nextInt();
            System.out.print("Resultado: ");
            int resultado=(int) a+b;
            System.out.print(resultado);
        }
        else if (num==3){//En este bloque al ser seleccionada la opción uno se realiza una multiplicación, en donde establamos dos variables enteras para que pueda realizar la operación y a su vez hacemos que los imprima, en donde determinamos otra variable para que nos de el resultado y nos lo imprima
            System.out.print("Ingrese primer número: ");
            int a = sc.nextInt();
            System.out.print("Ingrese segundo número: ");
            int b = sc.nextInt();
            System.out.print("Resultado: ");
            int resultado=(int) a-b;
            System.out.print(resultado);
        }
        else{//En este bloque al ser seleccionada la opción uno se realiza una multiplicación, en donde establamos dos variables enteras para que pueda realizar la operación y a su vez hacemos que los imprima, en donde determinamos otra variable para que nos de el resultado y nos lo imprima
            System.out.print("Ingrese primer número: ");
            int a = sc.nextInt();
            System.out.print("Ingrese segundo número: ");
            int b = sc.nextInt();
            System.out.print("Resultado: ");
            int resultado=(int) a/b;
            System.out.print(resultado);
        }
    }
}