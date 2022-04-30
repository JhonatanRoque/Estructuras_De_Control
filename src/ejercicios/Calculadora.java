package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Calculadora {
     public static void main(String[] args) {
        menu();
    }
     
   private static void sumar(int x, int y){
        int resultado = x + y;
        System.out.println(resultado);
    }  
   
   private static void restar(int a, int b){
       int resultado = a - b;
       System.out.println(resultado);
   }
   
   private static void multiplicacion(int a, int b){
       int resultado = a * b;
       System.out.println(resultado);
   }
   
   private static void division(int a, int b){
       int resultado = a/b;
       System.out.println(resultado);
   }
   
   //Menu
   private static void menu(){
       NumberFormat formato = new DecimalFormat("#0.00");
       Scanner leer = new Scanner(System.in);
       int valor1, valor2;
     
       System.out.println(" << CALCULADORA >> ");
       System.out.println("+-------------------------+");
       System.out.println("| Seleccione una opción   |");
       System.out.println("| S- Suma                 |");
       System.out.println("| R- Resta                |");
       System.out.println("| M- Multiplicación       |");
       System.out.println("| D- Division             |");
       System.out.println("+----------------------   +");
       System.out.println("Opción: ");
       String opcion;
       opcion = leer.next();
       if("S".equals(opcion) | "s".equals(opcion)){
           System.out.println("Ingrese el valor 1: ");
           valor1 = leer.nextInt();
           System.out.println("Ingrese el valor 2: ");
           valor2 = leer.nextInt();
           System.out.println("El resultado de la suma es: ");
           sumar(valor1, valor2);
       }else if("R".equals(opcion) | "r".equals(opcion)){
            System.out.println("Ingrese el valor 1: ");
           valor1 = leer.nextInt();
           System.out.println("Ingrese el valor 2: ");
           valor2 = leer.nextInt();
           restar(valor1, valor2);
       }else if("M".equals(opcion) | "m".equals(opcion)){
            System.out.println("Ingrese el valor 1: ");
           valor1 = leer.nextInt();
           System.out.println("Ingrese el valor 2: ");
           valor2 = leer.nextInt();
           System.out.println("El resultado de la multiplicación es: ");
           multiplicacion(valor1, valor2);
       }else if("D".equals(opcion) | "d".equals(opcion)){
            System.out.println("Ingrese el valor 1: ");
           valor1 = leer.nextInt();
           System.out.println("Ingrese el valor 2: ");
           valor2 = leer.nextInt();
           System.out.println("El resultado de la division es: ");
           division(valor1, valor2);
       }else {
           System.out.println("Opción ingresada erronea! ");
       }
   }
}