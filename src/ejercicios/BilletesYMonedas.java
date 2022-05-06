package ejercicios;

import java.util.Scanner;

public class BilletesYMonedas {
    
    public static void main(String[] args) { Scanner sc=new Scanner(System.in);
double importe=0; do{
try{
System.out.println("Ingresa el tiempo de la llamda en minutos:"); int tiempo=sc.nextInt();
System.out.println("MONTO A PAGAR:");
if (tiempo==3){
importe=0.20;
System.out.println("$"+importe);
}
else if(tiempo>3){
int tiempoA=tiempo-3; double tiempoAdicional=(tiempoA*0.05)+0.20;
importe=tiempoAdicional;
System.out.println("$"+tiempoAdicional);
}
}catch(Exception e){
System.out.println("Introduciste un dato erroneo."); System.out.println(""); sc.nextLine();
}
}
while(importe<=0);
calcular(importe);
}
public static void calcular(double importe)
{
double [] monedas={20,10,5,1,0.25,0.10,0.05,0.01}; double [] devolver={0,0,0,0,0,0,0,0};
for(int i=0;i<monedas.length;i++)
{
if(importe>=monedas[i])
{
devolver[i]=Math.floor(importe/monedas[i]);
importe=importe-(devolver[i]*monedas[i]);
}
}
for(int i=0;i<monedas.length;i++)
{ if(devolver[i]>0)
{
if(monedas[i]>2)
{
System.out.println(devolver[i]+" billetes de: $"+monedas[i]);
}else{
System.out.println(devolver[i]+" monedas de: ¢"+monedas[i]);
}
}
}
}
}
