package ejercicios;


public class CalculoDeSalarioCompuSmart {
    private double totalVentas;
    private double comision;
    private double salarioBruto;
    private double sueldoNeto;
    private double renta;

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
    
    
    //Metodo para calcular la comision
    public double calcComision(double totalVentas){
        double Comision =0.0;
        if(totalVentas >= 3000){
            Comision = totalVentas * 0.10;
        }else if((totalVentas < 3000) && totalVentas >= 2000){
            Comision = totalVentas * 0.08;
        }
        else if((totalVentas >= 1) && (totalVentas < 2000)){
            Comision = totalVentas * 0.05;
        }
        this.setComision(Comision);
        return Comision;
    }
    //Método para calcular el salarioBruto (comision + salarioBase)
    public double calcSalarioBruto(){
        double salarioB;
        salarioB = 300 + this.getComision();
        this.setSalarioBruto(salarioB);
        return salarioB;
    }
    //Método para calcular la renta del 10%
    public double calcRenta(){
        double Renta;
        Renta = this.getSalarioBruto() * 0.10;
        this.setRenta(Renta);
        return Renta;
    }
    //Método para calcular el salarioNeto (salarioNeto - Renta)
    public double calcSalarioNeto(){
        double salarioN;
        salarioN = this.getSalarioBruto() - this.getRenta();
        this.setSueldoNeto(salarioN);
        return salarioN;
    }
    //Constructor
    public CalculoDeSalarioCompuSmart(){
        
    }
}
