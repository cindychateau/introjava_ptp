/*
PascalCase - CadaPalabraVaConMayuscula -> Nombre de archivos y nombres de clases
javac NombreArchivo.java -> compilar
java NombreArchivo -> ejecutar
 */

public class Intro {

    //Método principal = Método que se ejecuta con nuestro archivo
    public static void main(String[] args) {

        System.out.println("¡Hola mundo!"); //Impresión

        //Variable primitiva - Solo guarda el valor.
        int miEntero; //Declarando una variable sin establecer un valor
        miEntero = 400; //Asignamos el valor en otra línea de código
        double pi = 3.141592; //Declaro la variable y asigno valor en un 1 línea
        boolean bool = true; //true o false
        char unCaracter = 'a'; //Un caracter

        System.out.println(pi);

        //Variables tipo objeto - Métodos/funciones pre hechas
        //nombreDeVariables
        Integer myInteger = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        String myString = "ABC";

        //Cadenas - Strings
        String cadena = "Buenas tardes a todos mis Compañeros";
        System.out.println("Cantidad de caracteres:"+cadena.length());
        char letra = cadena.charAt(1); //el caracter en la posición que indicamos en ()
        System.out.println(letra);

        int a = cadena.indexOf("Buenas"); //Me regresa la posición del texto
        int b = cadena.indexOf("compañeros");
        int c = cadena.indexOf("hola");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(cadena.toLowerCase()); //minúsculas
        System.out.println(cadena.toUpperCase()); //MAYUSCULAS

        String x = "Hola";
        String y = "Hola";

        System.out.println(x.equals(y)); //Comparamos dos textos

        saludo();

        int suma = sumatoria(5, 10); //15
        System.out.println("La suma es:"+suma);

        String saludando = saludoNombre("Elena"); //Hola Elena
        System.out.println(saludando);

    }

    //Permisos de función: public, private, protected
    //static -> es de la clase (Jueves a más detalle)
    //Tipo de valor de retorno: String, int, double. Si NO regreso nada: void
    //nombre de función
    //(parametros a recibir)
    public static void saludo() {
        System.out.println("¡Hola mundo!");
    }
    /*
    int numero1 = 5;
    int numero2 = 10;
    int suma = 5 + 10 = 15;
     */
    public static int sumatoria(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    /*  
    String nombre = "Elena"
    return "Hola Elena"
     */
    public static String saludoNombre(String nombre) {
        return "Hola "+nombre;
    }


}