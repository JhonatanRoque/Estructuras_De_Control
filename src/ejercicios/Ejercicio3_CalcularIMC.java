package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Ejercicio3_CalcularIMC {
    public static void main(String[] args) {
        CalcularIndiceMasaCorporal IMC = new CalcularIndiceMasaCorporal();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su estatura: ");
        double estatura = leer.nextDouble();
        System.out.println("Ingrese su peso: ");
        double peso = leer.nextDouble();
        IMC.calcularIMC(peso, estatura);
        IMC.clasificacionIMC(IMC.getIMC());
        
    }
}
