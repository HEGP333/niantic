
/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrativo extends Persona
{
    private String cargo;
    private String numeroExtensionTelefonica;
    private double comision;

    public Administrativo(String codigo,String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, String cargo, String numeroExtensionTelefonica, double comision) 
    {
        super(codigo, cedula, nombre, edad, fechaActual, fechaIngreso);
        this.cargo = cargo;
        this.numeroExtensionTelefonica = numeroExtensionTelefonica;
        this.comision = comision;
    }

    public String getCargo() {
        return cargo;
    }
    
    public double getComision() {
        return comision;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getNumeroExtensionTelefonica() {
        return numeroExtensionTelefonica;
    }

    public void setNumeroExtensionTelefonica(String numeroExtensionTelefonica) {
        this.numeroExtensionTelefonica = numeroExtensionTelefonica;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Cargo: " + cargo);
        System.out.println("Número de extensión telefónica: " + numeroExtensionTelefonica);
    }
    
    @Override
    public void calcularSalarioAdministrativo(){
        super.calcularSalarioAdministrativo();
        double salarioAdministrativo = salarioBase+comision;
        System.out.println("Salario del Administrativo " +getNombre() +": " +salarioAdministrativo);
    }
}

