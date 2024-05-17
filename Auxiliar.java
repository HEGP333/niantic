
/**
 * Write a description of class Auxiliar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auxiliar extends Persona
{
    private String cargo;
    private double auxilioTransporte;
    
    //constructor
    public Auxiliar (String codigo, String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, String cargo, double auxilioTransporte){
        super(codigo, cedula, nombre, edad, fechaActual, fechaIngreso);
        this.cargo = cargo;
        this.auxilioTransporte = auxilioTransporte;
        
    }
    
    //getters and setters
    public String getCargo(){
        return cargo;
    }
    
    public double getAuxilioTransporte(){
        return auxilioTransporte;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setAuxilioTransporte(double auxilioTransporte){
        this.auxilioTransporte = auxilioTransporte;
    }
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Cargo: " + cargo);
        System.out.println("Auxilio de Transporte: " + auxilioTransporte);
    }
    
    @Override
    public void calcularSalarioAuxiliar(){
        super.calcularSalarioAuxiliar();
        double salarioAuxiliar;
        salarioAuxiliar = salarioBase+auxilioTransporte;
        System.out.println("Salario del Auxiliar " +getNombre() +": " +salarioAuxiliar);
    }
    
}
