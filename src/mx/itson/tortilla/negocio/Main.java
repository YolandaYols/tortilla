
package mx.itson.tortilla.negocio;

import java.util.Scanner;

/**
 *
 * @author marcmartinez
 */
public class Main {

    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar lista de estudiantes ");
        String entrada = sc.nextLine();
        
        String[] lista = entrada.split(",");
        
        for(String a: lista){
        
            String[] students = entrada.split(" ");
            String id = students[0];
            String firtsName = students[1];
            String lasname = students[2];   
            
            System.out.println("ID: "+id+" - "+firtsName+" "+lasname);

        }
        
    
    }
    
}
