
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // atributos
    String codigo, cedula, nombre;
    int edad;
    Fecha fechaActual;
    Fecha fechaIngreso;
    static double salarioBase = 1300000;
    
    // constructor
    public Persona(String codigo, String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso){
      this.codigo=codigo;
      this.cedula=cedula;
      this.nombre=nombre;
      this.edad=edad;
      this.fechaActual = fechaActual;
      this.fechaIngreso = fechaIngreso;
    }
    
    public Persona(){
      this.codigo="1152388";
      this.cedula="1564645";
      this.nombre="Juan";
      this.edad=16;
    }
    //getters & setters
    public String getCodigo(){
     return codigo;
      }
    
    public String getCedula(){
     return cedula;
      }
    
    public String getNombre(){
     return nombre;
      }
    
    public int getEdad(){
     return edad;  
     }
    
    public Fecha getFechaActual(){
     return fechaActual;
      }
      
    public Fecha getFechaIngreso(){
     return fechaIngreso;
      }
      
    public void setCodigo(String codigo){
     this.codigo=codigo;
      }
    
    public void setCedula(String cedula){
          this.cedula=cedula;
        }
    
    public void setNombre(String nombre){
     this.nombre=nombre;
      }
    
    public void setEdad(int edad){
     this.edad=edad;  
     }
     
    public void setFechaActual(Fecha fechaActual){
     this.fechaActual = fechaActual;  
     }
     
    public void setFechaIngreso(Fecha fechaIngreso){
     this.fechaIngreso = fechaIngreso;  
     }
    
      public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("Código: " + codigo);
    }
    
    public void calcularSalarioProfesor(){
    }
    
    public void calcularSalarioAuxiliar(){
    }
    
    public void calcularSalarioAdministrativo(){
    }
    
    public void calcularExperiencia(){
        int experiencia;
        experiencia = fechaActual.getAño()-fechaIngreso.getAño();
        System.out.println("La experiencia de " +getNombre() +" es de: " +experiencia +" años");
    }
    
}
