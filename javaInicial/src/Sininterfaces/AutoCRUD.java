
package Sininterfaces;

/**
 *
 * @author aliet
 */
import java.util.ArrayList;
import java.util.List;

public class AutoCRUD {
    List<Auto> autos = new ArrayList<>();
    
   public void save(Auto auto){
       autos.add(auto);
       
   }
   
   public void delete(Auto auto){
       
   }
   
   public List<Auto> findall(){
       return autos;
   }
}
