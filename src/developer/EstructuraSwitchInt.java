package developer;

import java.io.*;

public class EstructuraSwitchInt {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar un número entre 1 y 5: ");
            int numero = Integer.parseInt(leer.readLine());
            switchInt(numero);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void switchInt(int numero){
        String nombreDelNumero;
        switch(numero){//Valor o caracter a evaluar
            case 1://En el caso que el valor sea 1
                nombreDelNumero = "UNO";
                break;//Detiene el proceso si era el valor ingresado
            case 2://En el caso que el valor sea 2, y así sucesivamente
                nombreDelNumero = "DOS";
                break;
            case 3:
                nombreDelNumero = "TRES";
                break;
            case 4: 
                nombreDelNumero = "CUATRO";
                break;
            case 5:
                nombreDelNumero = "CINCO";
                break;
            default: //Si no cumple ningunode los anteriores
                nombreDelNumero = "Numero no valido!";
                break;
        }
        System.out.println("El numero ingresado es: " + nombreDelNumero);
    }
    
}
