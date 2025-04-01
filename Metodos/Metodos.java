package Metodos;

class Calculadora {
    //Metodo que suma dos numeros
    public int sumar(int a, int b) {
        return a + b;
    }
}

public class Metodos {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(10, 5);
        System.out.println("La su,a es:" + resultado);
    }
}
