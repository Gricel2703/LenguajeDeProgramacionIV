public class Calculadora {
    public double resultado;
    public double variablex;
    public double variabley;

    public double Suma(double _variablex, double _variabley){
        variablex = _variablex;
        variabley = _variabley;
        return resultado = variablex + variabley;
    }

    public double Resta(double _variablex, double _variabley){
        double variableX = _variablex;
        double variableY = _variabley;
        return resultado = variableX - variableY;
    }

    public double Multiplicacion(double _variablex, double _variabley){
        variablex = _variablex;
        variabley = _variabley;
        return resultado = variablex * variabley;
    }

    public double Division(double _variablex, double _variabley){
        double variableX = _variablex;
        double variableY = _variabley;
        return resultado = variableX / variableY;
    }
}
