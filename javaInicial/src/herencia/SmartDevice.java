/* CLASE 4 - HERENCIA (Actividad 3)
 * En este ejercicio tendréis que crear una clase SmartDevice. 
 * Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
package herencia;

/**
 *
 * @author aliet
 */
public class SmartDevice {
    
    String type;
    String brand;
    String modelo;
    int year;
    
    //Constructores Clase Padre
    public SmartDevice(){
        
    }
    public SmartDevice(String type, String brand, String modelo, int year){
        this.type = type;
        this.brand = brand;
        this.modelo = modelo;
        this.year = year;    
    }
 
    public static void main(String[] args) {
        
        SmartDevice smart1 = new SmartDevice("phone","nokia","m21",2021);
        System.out.println("El tipo es: " + smart1.type + ", "  + "el modelo es: " + smart1.brand );
        SmartPhone phonenokia = new SmartPhone("nokia", "A1", 12, "black", "4G");
        System.out.println("La marca es: " + phonenokia.brand + ", " + "el modelo es: " + phonenokia.modelo + ", " + ", " + "El color es " + phonenokia.color + ", Pixeles de la camara: " + phonenokia.pixcamara);
        SmartWatch iphonew = new SmartWatch("iPhone", "AA1", 100, 2.1, 1.2);
        System.out.println("La marca es: " + iphonew.brand + ", " + "el modelo es: " + iphonew.modelo + ", el precio es " + iphonew.precio + ", dimensiones: " + iphonew.dheight + "x" + iphonew.dwide);
       
    }  
}

