/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainicial;

/**
 *
 * @author aliet
 */
public class FuncionPrecio {
    
    public static void main(String[] arg) {

       double precioin = 100.0;
       double iva = 0.16;
       double precioiva = precioin + precioin * iva;
       
       double precio = generarprecio(precioin, iva, precioiva);
       System.out.println("El precio con IVA es: " + precio);
    }    
    
    static double generarprecio(double preciosin, double iva, double precioiva){
        
        return precioiva;
        
    }
}