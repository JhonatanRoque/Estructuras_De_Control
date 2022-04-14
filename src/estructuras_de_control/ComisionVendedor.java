
package estructuras_de_control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComisionVendedor {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar valor de la venta:");
            double valorVenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el genero del vendedor:");
            String genero = leer.readLine();
            //Envia el parametro valorVenta y la inicial del genero ingresado en mayúscula
            calcularComision(valorVenta, genero.toUpperCase().charAt(0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void calcularComision(double valorVenta, char generoVendedor){
        double comision, salario = 0.0; //Es necesario inicializar las variables
        String genero = ""; //Si no se inicializa provocar un error en la lista 43
        if (generoVendedor == 'M'){
            genero = "Masculino";
            comision = valorVenta * 0.03;
            salario = comision + 200;
        }else if (generoVendedor == 'F'){
            genero = "Femenino";
            comision = valorVenta * 0.05;
            salario = comision + 200;
        }
        //Las variables genero y salario se deben inicializar
        System.out.println("El salario del vendedor " + genero + " es de " + salario);
    }
    
    public static void ifString(String genero){
        if (genero.equals("femenino")){
            System.out.println("F");
        }else if (genero.equals("masculino"))
            System.out.println("M");
    }
}
