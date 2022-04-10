package herencia;

/**
 *
 * @author aliet
 */
//Clases Hijos 
public class SmartPhone extends SmartDevice {
    int pixcamara;
    String color;
    String tecnologia; 
    //Constructor vacio --  Clase Hijo
    public SmartPhone(){
        
    }
    //Constructor con parametros -- Clase hijo
    public SmartPhone(String brand, String modelo, int pixcamara, String color, String tecnologia){
        this.brand = brand;
        this.modelo = modelo;
        this.pixcamara = pixcamara;
        this.color = color;
        this.tecnologia = tecnologia;
    }
    
   
}
