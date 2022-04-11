
package Interfaces;

import Sininterfaces.Auto;
import Sininterfaces.AutoCRUD;
import java.util.List;

/**
 *
 * @author aliet
 */
public class Main {

    public static void main(String args[]) {
    
    // Crear clase
     CocheInterCRUD cochecrud = new CocheInterCRUD();
     Coche coche1 = new Coche("Ford", 8, 4, "Gasolina", 2020);
     Coche coche2 = new Coche("Kia", 4, 4, "Gasolina", 2019);
     Coche coche3 = new Coche("Fiat", 4, 2, "Gas", 2018);
     cochecrud.save(coche1);
     cochecrud.save(coche2);
     cochecrud.save(coche3);
     cochecrud.findall();
     cochecrud.delete(coche3);
             
    }

}
