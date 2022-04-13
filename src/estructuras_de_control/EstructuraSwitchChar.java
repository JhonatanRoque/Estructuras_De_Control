
package estructuras_de_control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            System.out.println("Ingresar el estado civil de la persona:");
            String estadoCivil = leer.readLine(); //Dato tipo String
            //toUpperCase convierte el contenido a meyúscula y cahrAt extrae el caracter de la posicion 0
            switchChar(estadoCivil.toUpperCase().charAt(0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void switchChar(char estadoCivil){ //Método para el switch
        String mensajeEstadoCivil;
        switch(estadoCivil){ //Valor o caracter a evaluar
            case 'S': //En el caso que el valor sea "S"
               mensajeEstadoCivil = "Soltero/a";
               break; //Detiene el proceso si era el valor ingresado
            case 'C': //En el caso que el valor sea "C" y asi sucesivamente
                mensajeEstadoCivil = "Casado/a";
                break;
            case 'D':
                mensajeEstadoCivil = "Divirsiado/a";
                break;
            case 'A':
                mensajeEstadoCivil = "Acompañado/a";
                break;
            case 'F':
                mensajeEstadoCivil = "Forever Alone";
                break;
            default: //Si no se cumple ninguna de las anteriores
                mensajeEstadoCivil = "Estado civil erroneo!";
        }
        System.out.println("Su estado civil es: " + mensajeEstadoCivil);
    }
}
