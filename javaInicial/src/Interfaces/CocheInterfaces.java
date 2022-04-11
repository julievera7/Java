package Interfaces;

import java.util.List;

/**
 *
 * @author aliet
 */
public interface CocheInterfaces {

    void save(Coche coche);
    
    List<Coche> findall();
    
    void delete(Coche coche);
}
