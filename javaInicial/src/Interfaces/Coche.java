
package Interfaces;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aliet
 */
public class Coche {
    String marca;
    int cilindros;
    int puertas;
    String combustible;
    int year;
    
    public Coche(String marca, int cilindros, int puertas, String combustible, int year){
        this.marca = marca;
        this.cilindros = cilindros;
        this.puertas = puertas;
        this.combustible = combustible;
        this.year = year;
    }
   
}
