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


}