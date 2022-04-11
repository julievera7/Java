
package Interfaces;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author aliet
 */
public class CocheInterCRUD implements CocheInterfaces  {
    
    List<Coche> coches = new ArrayList<>();
    
    @Override
    public void save(Coche coche){
        coches.add(coche);
    }
    
    @Override
    public  List<Coche> findall(){
        return null;
    }
    
    @Override
    public void delete(Coche coche){
        coches.remove(coche);
    }
}
