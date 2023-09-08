package mx.itson.tortilla.negocio;
/**
 * Contiene métodos para trabajr con cadenas de texto.
 * @author Yols Martinez
 */

public class Operation {
    
    //hola a todos jajajjajaja xD

    /**
     * separa una cadena de texto en donde encuentre el caracter guin medio.
     * @param oracion Es la oración que sera separada en fracciones. 
     * @return Array de String en cuyo cada componente será una fracción de la cadena otorgada
     */
    public String[] separar(String oracion) {
        String[] resultado = oracion.split("-"); 
        return resultado;
    }

}
