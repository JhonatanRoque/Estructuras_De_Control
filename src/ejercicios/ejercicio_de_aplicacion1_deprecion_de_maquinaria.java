package ejercicios;

import java.io.BufferedReader;
import java.io.Exception;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ejercicio_de_aplicacion1_deprecion_de_maquinaria {
    public static void main(String[] args) {
        // Estructura de apliacion-Cristina Argueta SIS21B
        try {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); 
            
        System.out.println("Ingrese el costo de la Maquinaria:");
        double Maquinaria=Double.parseDouble(leer.readLine());
        
        System.out.println("Ingrese el nombre de la Maquinaria:");
        String nombMaquinaria=leer.readLine();
        
        System.out.println("Ingrese la cantidad de años en la cual sera depreciada la Maquina:");
        int tiempo=Integer.parseInt(leer.readLine());
        
        System.out.println("---------------------------");
        System.out.println("Nombre de Maquinaria: "+nombMaquinaria);
        
       CalcuDepreciacionDeBienes(tiempo,Maquinaria);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public static void CalcuDepreciacionDeBienes(int tiempo, double Maquinaria){
        
         double sumad = ((tiempo*(tiempo+1))/2);
         int b=1;
        for(int i=tiempo; i>=1; i--){ 

        double c=i/sumad;
        double Depreci=Maquinaria*c;
        
            System.out.println("Depreciacion Año #"+ b + ": "+ Depreci);
             b++;
        }
    }
}

