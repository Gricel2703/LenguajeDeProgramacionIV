import java.util.Scanner; //Se importa la referencia java.util.Scanner en donde nos permitira usar la clase Scanner para ingresar datos mediante el teclado
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //Clase
    public static void main(String[] args) { //Iniciando la clase llamada Main la cual nos permite interactuar con la consola
        Scanner sc = new Scanner(System.in); //Creación de la clase
        System.out.print("Ingrese un número: "); //Impresión de cualquier número ingresado
        int num = sc.nextInt(); //Establecemos el nombre de la variable del número
        if (num==10){//Hacemos una condición preguntando si el número que se ingreso es igual a 10
            System.out.print("Número igual a 10");//Impresión de un texto mostrando que la condición que se le otorgo si cumple
        }
        else if (num<10){//Hacemos una segunda condición preguntando si el número que se ingreso es menor a 10
            System.out.print("Número menor que 10"); //Impresión de un texto señalando la condición establecida
        }
        else {//Es un condicional que se otorga por defecto indiciando en este caso que si el número ingresado es mayor a 10
            System.out.print("Número mayor que 10"); //Impresión de un texto indicando que la condición cumple
        }
    }
}