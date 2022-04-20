package datosAvanzados;
import java.util.*;
import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;

/**
 * @author aliet
 */
public class DatosAvanzados {
//1. Dada la función:  public static String reverse(String texto) { }

  
    String cadenatexto;
    String arrayUni[];    
       
    public static void main(String args[]) throws IOException {
        String pregunta1 = "1. Escribe el código que devuelva una cadena al revés."; 
        System.out.println(pregunta1);
        String cadenatexto = "Hola mundo";
	System.out.println(cadenatexto);
	StringBuilder cadena = new StringBuilder(cadenatexto);
		cadenatexto = cadena.reverse().toString();
		System.out.println(cadenatexto);
        
        String pregunta2 = "2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores."; 
        System.out.println(pregunta2);
        String arrayUni[] = {"teclado", "mouse", "pantalla", "cpu", "ups"};
        String partes;
        for(int i = 0; i < arrayUni.length; i++){            
            System.out.println(i + " " + arrayUni[i]  +  "");
        }
        String pregunta3a = "3.a Crea un Vector y añádele 5 elementos.";
        System.out.println(pregunta3a);
        Vector<String> vectorNombres = new Vector(5);
        vectorNombres.add("Juan");
        vectorNombres.add("Pedro");
        vectorNombres.add("Pablo");
        vectorNombres.add("Carlos");
        vectorNombres.add("Jesus");
        System.out.println("El vector: " + vectorNombres);
        
     
      
      String pregunta3b = "3.b Elimina el 2o y 3er elemento y muestra el resultado final.";
      System.out.println(pregunta3b);
       vectorNombres.remove(1);
       vectorNombres.remove(1);
       System.out.println("El vector: " + vectorNombres);
       
       String pregunta5a = "5a. Crea un ArrayList de tipo String, con 4 elementos."; 
       System.out.println(pregunta5a);
       ArrayList<String> listaArray = new ArrayList();
       listaArray.add("Zapatos");
       listaArray.add("Pantalones");
       listaArray.add("Camisas");
       listaArray.add("Franelas");
       
       for(int i = 0; i < listaArray.size(); i++){
           System.out.println(listaArray.get(i));   
       }
       
       String pregunta5b = "5b. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.";
       System.out.println(pregunta5b);
       LinkedList<String> listaLink = new LinkedList<String>(listaArray);
       
       for(int i = 0; i < listaLink.size(); i++){
           System.out.println(listaLink.get(i));   
       }
       
       String pregunta6a = "Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. ";
       System.out.println(pregunta6a);
       
       ArrayList<Integer> lista = new ArrayList(9);
       
       for(int i = 0; i < 10; i++){
           lista.add(i + 1);
       }
        
       for(int i = 0; i < lista.size(); i++){
           System.out.println(lista.get(i));   
           
       }
       
       String pregunta6b = "A continuación, con otro bucle, recórrelo y elimina los numeros pares. ";
        System.out.println(pregunta6b);
       for(int i = 0; i < lista.size(); i++){
               lista.removeIf(e -> (e % 2) == 0);
         
       }
       
       String pregunta6c = "Por último, vuelve a recorrerlo y muestra el ArrayList final. ";
      System.out.println(pregunta6c);
        for(int i = 0; i < lista.size(); i++){
           System.out.println(lista.get(i));   
        
            }
      
       String pregunta7 = "Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". Finalmente, mostraremos en cualquier caso: \"Demo de código\"";   
 
       System.out.println(pregunta7);
       
       try{
           division(5,0);
       }catch(ArithmeticException e){
           System.out.println("No puede dividir entre cero");
       }


       
       
       String pregunta8 = "Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\". La tarea de la función será realizar la copia del fichero dado en el parámetro \"fileIn\" al fichero dado en \"fileOut\".";
       System.out.println(pregunta8);
       try{
           pregunta8("/home/aliet/fichero.txt", "/home/aliet/copia.txt");
       }catch(FileNotFoundException e){
           System.out.println("No se encuentra el archivo");
       }
    
    }

     static int division(int a, int b) throws ArithmeticException{
        int resultadod = 0;
        try{
            resultadod = a / b;    
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        
      return resultadod;  
      
      
    }

     static void pregunta8(String fileIn, String fileOut) throws FileNotFoundException, IOException {
         try {
             InputStream fichero = new FileInputStream(fileIn); 
            
             
             try{
                 byte []datos = fichero.readAllBytes();
                 PrintStream copiafichero = new PrintStream(fileOut);
                 out.write(datos);
                 for (byte dato : datos){
                     System.out.print((char) dato);
                 }
             }catch(IOException e){
                 throw new IOException();
             }
                
         } catch(FileNotFoundException e){
             throw new FileNotFoundException();
         }
     }   
}

