/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuracontrol;

/**
 *
 * @author aliet
 */
public class Bucle {
    
    public static void main(String[] args){
        
    String[] diassemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    String cadenatexto = "";
    for(int i = 0; i < diassemana.length; i++){
     
        cadenatexto += diassemana[i] + ","; 
        if (i == diassemana.length){
            break;
        }
    }  
    System.out.print(cadenatexto);

   }
}
    

