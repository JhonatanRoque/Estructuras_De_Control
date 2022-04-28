
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcularIntereSimple {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("INGRESAR LA SIGUENTE INFORMACION:");
            System.out.println("Cantidad de dinero depositada:");
            double cantidad = Double.parseDouble(leer.readLine());
            System.out.println("Cantidad de años del deposito:");
            int anhios = Integer.parseInt(leer.readLine());
            System.out.println("Interes anual por el deposito:");
            double interes = Double.parseDouble(leer.readLine());
            System.out.println("-----------------------------");
            interesSimple(cantidad, anhios, interes);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void interesSimple(double cantidad, int anhios, double interes){
        for (int i = 1; i <= anhios ; i++) {
            double interesPorAnhios = cantidad * (interes / 100); //Calculo del interes anual
            cantidad += cantidad * (interes / 100); //Suma a la cantidad actual + el interes de esa cantidad
            System.out.println("Cantidad interes en el año " + i + ": " + interesPorAnhios);
            System.out.println("Monto interes mas dinero: " + cantidad);
            System.out.println("=============================");
        }
    }
}
