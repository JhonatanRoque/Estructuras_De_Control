package ejercicios;
/*
La empresa CompuSmart se dedica a la venta de equipos de computación. Vende tanto computadoras como
dispositivos periféricos y consumibles. La empresa cuenta con un grupo de 5 vendedores a los cuales les paga
la comisión según el rango de la venta efectuada. Si el vendedor vende de $3000 en adelante la comisión es el
10%, si vende de $1000 a $2999 gana el 8% y si la venta es de $1 a $999 gana un 5%. Pero cada vendedor tiene un
salario base de $300 al cual se le suma el valor de la comisión por ventas. Determinar el salario líquido de un
vendedor según el monto de la venta realizada tomando en cuenta que se descuenta el 10% en concepto de renta.
*/

import java.io.*;

public class EjercicioCondicionalesSimples2_CompuSmart {
    public static void main(String[] args) {
        //Objeto BufferedReader para la lectura de datos desde teclado
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Objeto de la clase CalculoDeSalarioCompuSmart
        CalculoDeSalarioCompuSmart calculo = new CalculoDeSalarioCompuSmart();
        try{
            //Variables
            double tv1, tv2, tv3, tv4, tv5;
            //Ingreso de datos desde teclado
            System.out.println("Ingrese el total de ventas para el empleado 1: ");
            tv1 = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el total de ventas para el empleado 2: ");
            tv2 = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el total de ventas para el empleado 3: ");
            tv3 = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el total de ventas para el empleado 4: ");
            tv4 = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el total de ventas para el empleado 5: ");
            tv5 = Double.parseDouble(leer.readLine());
            
            //Proceso e impresion de datos
            System.out.println("---------------------------------------------");
            System.out.println("Empleado 1: ");
            calculo.setTotalVentas(tv1);
            calculo.calcComision(tv1);
            calculo.calcSalarioBruto();
            calculo.calcRenta();
            calculo.calcSalarioNeto();
            System.out.println("Comision     : $" + calculo.getComision());
            System.out.println("SalarioBruto : $" + calculo.getSalarioBruto());
            System.out.println("Renta        : $" + calculo.getRenta());
            System.out.println("SalarioNeto  : $" + calculo.getSueldoNeto());
            System.out.println("Empleado 2: ");
            calculo.setTotalVentas(tv2);
            calculo.calcComision(tv2);
            calculo.calcSalarioBruto();
            calculo.calcRenta();
            calculo.calcSalarioNeto();
            System.out.println("Comision     : $" + calculo.getComision());
            System.out.println("SalarioBruto : $" + calculo.getSalarioBruto());
            System.out.println("Renta        : $" + calculo.getRenta());
            System.out.println("SalarioNeto  : $" + calculo.getSueldoNeto());
            System.out.println("Empleado 3: ");
            calculo.setTotalVentas(tv3);
            calculo.calcComision(tv3);
            calculo.calcSalarioBruto();
            calculo.calcRenta();
            calculo.calcSalarioNeto();
            System.out.println("Comision     : $" + calculo.getComision());
            System.out.println("SalarioBruto : $" + calculo.getSalarioBruto());
            System.out.println("Renta        : $" + calculo.getRenta());
            System.out.println("SalarioNeto  : $" + calculo.getSueldoNeto());
            System.out.println("Empleado 4: ");
            calculo.setTotalVentas(tv4);
            calculo.calcComision(tv4);
            calculo.calcSalarioBruto();
            calculo.calcRenta();
            calculo.calcSalarioNeto();
            System.out.println("Comision     : $" + calculo.getComision());
            System.out.println("SalarioBruto : $" + calculo.getSalarioBruto());
            System.out.println("Renta        : $" + calculo.getRenta());
            System.out.println("SalarioNeto  : $" + calculo.getSueldoNeto());
            System.out.println("Empleado 5: ");
            calculo.setTotalVentas(tv5);
            calculo.calcComision(tv5);
            calculo.calcSalarioBruto();
            calculo.calcRenta();
            calculo.calcSalarioNeto();
            System.out.println("Comision     : $" + calculo.getComision());
            System.out.println("SalarioBruto : $" + calculo.getSalarioBruto());
            System.out.println("Renta        : $" + calculo.getRenta());
            System.out.println("SalarioNeto  : $" + calculo.getSueldoNeto());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    

}
