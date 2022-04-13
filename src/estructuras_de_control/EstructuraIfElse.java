
package estructuras_de_control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraIfElse {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario:");
            double salario = Double.parseDouble(leer.readLine());
            ifElse(salario); //Envia el valor de salario a ser evaluado al método
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void ifElse(double salario){
        if (salario > 235){ //La condicion que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minimo");
        }else{
            System.out.println("Usted gana menos del salario minimo");
        }
    }
}
