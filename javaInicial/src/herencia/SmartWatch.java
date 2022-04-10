package herencia;

/**
 *
 * @author aliet
 */
public class SmartWatch extends SmartDevice {
    int precio;
    double dheight;
    double dwide;  
    //Constructor vacio de la clase hijo
    public SmartWatch(){
        
    }
    //Constructor con parametros de la clase hijo
    public SmartWatch(String brand, String modelo, int precio, double dheight, double dwide){
        this.brand = brand;
        this.modelo = modelo;
        this.precio = precio;
        this.dheight = dheight;
        this.dwide = dwide;
    }

}
