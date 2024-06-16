
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha{
    private int dia, mes, año;
    
    //constructor
    public Fecha(){
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    //getters and setters
    public int getDia (){
        return dia;
    }
    
    public int getMes (){
        return mes;
    }
    
    public int getAño (){
        return año;
    }
    
    public void setDia (int Dia){
        this.dia = Dia;
    }
    
    public void setMes (int Mes){
        this.mes = Mes;
    }
    
    public void setAño (int Año){
        this.año = Año;
    }
    
}
