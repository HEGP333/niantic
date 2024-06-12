
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
  // atributos
  private String especialidad;
  private int horasSemanales;
  static double valorHora = 50000;
  
  // constructor
  
    public Profesor(String codigo,String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, String especialidad, 
                    int horasSemanales) 
    {
        super(codigo, cedula, nombre, edad, fechaActual, fechaIngreso);
        this.especialidad = especialidad;
        this.horasSemanales= horasSemanales;
    }
    
  //getters & setters
    public String getEspecialidad() {
        return especialidad;
        }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public int getHorasSemanales(){
        return horasSemanales; 
    }

    public void setHorasSemanales(int horassemanales){
        this.horasSemanales=horasSemanales; 
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Horas de dedicación semanal: " +horasSemanales);
    }
    
    @Override
    public void calcularSalarioProfesor(){
        super.calcularSalarioProfesor();
        double salarioProfesor = horasSemanales * 4 * valorHora;
        System.out.println("Salario del Profesor " +getNombre() +": " + salarioProfesor);
    }
    
    //fin?
    
    }
    

