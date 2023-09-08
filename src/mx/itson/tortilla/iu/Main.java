package mx.itson.tortilla.iu;

import java.util.Scanner;
import mx.itson.tortilla.negocio.Operation;

//Debugging 

/**
 * @author marcmartinez
 * 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("write the statement: ");
        
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();
        
        String[] resultado = new Operation().separar(enunciado);
        for (String s: resultado) {
            System.out.println(s);
        }
    }

}
