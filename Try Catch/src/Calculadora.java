import static java.lang.Math.PI;

public class Calculadora {
    public double resultado;
    public double variablex;
    public double variabley;
    public double variablez;
    public double perimetro;
    public double circunferencia;
    public double radio;

    public double Suma(double _variablex, double _variabley) {
        variablex = _variablex;
        variabley = _variabley;
        return resultado = variablex + variabley;
    }

    public double Resta(double _variablex, double _variabley) {
        double variableX = _variablex;
        double variableY = _variabley;
        return resultado = variableX - variableY;
    }

    public double Multiplicacion(double _variablex, double _variabley) {
        variablex = _variablex;
        variabley = _variabley;
        return resultado = variablex * variabley;
    }

    public double Division(double _variablex, double _variabley) {
        double variableX = _variablex;
        double variableY = _variabley;
        return resultado = variableX / variableY;
    }

    public double Perimetro(double variablex, double variabley, double variablez) {
        return perimetro = variablex + variabley + variablez;
    }

    public double Circunferencia(double variablex) {
        return circunferencia = variablex * PI;
    }

    public double Radio(double variablex) {
        return radio = variablex / 2;
    }
}
