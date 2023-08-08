public class StringManipulator {

    //Métodos
    /*
    String cadena1 = "    Hola     ";
    String cadena2 = "     Mundo    ";
    return "Hola"+"Mundo" -> "HolaMundo"
     */
    public String trimAndConcat(String cadena1, String cadena2) {
        return cadena1.trim()+cadena2.trim();
    }

    public int getIndexOrNull(String cadena, char letra) {
        return cadena.indexOf(letra);
    }

    /*
    cadena = "Hola", palabra = "mundo"
     */
    public int getIndexOrNull(String cadena, String palabra) {
        return cadena.indexOf(palabra);
    }

    //"Hola como estas".substring(inicio, fin)
    //"Hola como estas".substring(1, 3) -> ola
    /*
    palabra1 = "Hola"
    inicio = 1
    fin = 3
    palabra2 = "mundo"

    "Hola".substring(1, 3) + "mundo"
    "ol"+"mundo"    
    return "olmundo"

     */
    public String concatSubstring(String palabra1, int inicio, int fin, String palabra2) {
        return palabra1.substring(inicio, fin)+palabra2;
    }
    

}