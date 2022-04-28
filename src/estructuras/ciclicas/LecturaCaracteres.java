
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LecturaCaracteres {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el nombre:");
            String nombre = leer.readLine();
            //Pasar todo a mayúscula
            leerCaracteresFor(nombre.toUpperCase());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void leerCaracteresFor(String palabra){
        //for(valor inicial; valor final; incrementos)
        for (int i = 0; i < palabra.length(); i++) { //Parámetro final la cantidad de caracteres
            //palabra.charAt(i) imprime el caracter correspondiente a la posicion i
            System.out.println("Caracter: " + i + " ->: " + palabra.charAt(i));
        }
    }
}
