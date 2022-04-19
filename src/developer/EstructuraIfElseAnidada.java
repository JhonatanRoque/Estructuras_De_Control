package developer;

import java.io.*;

public class EstructuraIfElseAnidada {
    public static void main(String[] args) {
        try{//Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario: ");
            double salario = Double.parseDouble(leer.readLine());
            ifElseAnidad(salario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ifElseAnidad(double salario){
        if(salario > 235){//Si la condición que se evalua y en caso de ser verdadero
            System.out.println("Usted gana más del salario mínimo!");
        }else if (salario >0){//Si la condición anterior no se cumple evalua la siguiente condición
            System.out.println("Usted gana menos del salario mínimo!");
        }else{//En caso que la condición anterior no se cumpla se ejecuta lo siguiente
            System.out.println("Ingreso de dato erroneo!");
        }
    }
}
