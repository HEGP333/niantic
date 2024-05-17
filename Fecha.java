
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
    
    public void setDia (int newDia){
        this.dia = newDia;
    }
    
    public void setMes (int newMes){
        this.mes = newMes;
    }
    
    public void setAño (int newAño){
        this.año = newAño;
    }
    
}
