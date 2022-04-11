/**
Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
Ejemplo:
CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
package Sininterfaces;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aliet
 */
public class Main {

    public static void main(String args[]) {
    
    // Crear clase
     AutoCRUD autocrud = new AutoCRUD();
     Auto coche1 = new Auto("Ford", 8, 4, "Gasolina", 2020);
     Auto coche2 = new Auto("Kia", 4, 4, "Gasolina", 2019);
     Auto coche3 = new Auto("Fiat", 4, 2, "Gas", 2018);
     autocrud.save(coche1);
     autocrud.save(coche2);
     autocrud.save(coche3);
     
     List<Auto> autos = autocrud.findall(); 
     System.out.println(autos);
             
    }

}
