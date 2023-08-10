import java.util.ArrayList; //Importa ArrayList (listas dinámicas)
import java.util.HashMap;
import java.util.*;
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

        //Arreglos/Array/Lista - Es una variable en la cual podemos agregar más de un valor en distintas posiciones
        int[] miArreglo; //Declaración
        miArreglo = new int[5]; //Inicialización
        miArreglo[0] = 4;
        miArreglo[1] = 8;
        miArreglo[2] = 8;
        miArreglo[3] = 5;
        miArreglo[4] = 9;

        int[] miArreglo2 = {4, 8, 8, 5, 9};

        System.out.println(miArreglo[2]);
        System.out.println(miArreglo2[2]);

        ArrayList<Integer> miArreglo3 = new ArrayList<Integer>();
        miArreglo3.add(4);
        miArreglo3.add(8);
        miArreglo3.add(8);
        miArreglo3.add(5);
        miArreglo3.add(9);

        System.out.println(miArreglo3.get(2));

        //Condicionales
        boolean llueve = false; //No está lloviendo
        boolean soleado = true; //Si está soleado

        if(llueve) { //Si mi condicional es verdadera
            System.out.println("Lleva un paraguas!");
        } else {
            System.out.println("Diviértete!");
        }

        if(llueve) {
            System.out.println("Lleva un paraguas !");
        } else if(soleado) {
            System.out.println("Ponte bloqueador");
        } else {
            System.out.println("Vamos al parque :) ");
        }

        llueve = true;
        if(llueve && soleado) { //Ambas condicionales se cumplan
            System.out.println("Busca un arcoiris en el cielo");
        }

        int edad = 16;
        boolean permisoPadres = true;
        if( edad > 18 || permisoPadres ) { //Si una u otra condicional se cumplen
            System.out.println("Puedes tener licencia de conducir ;)");
        }

        /* BUCLES */
        /*
        i=0
        alo?

        i = 1
        alo?

        i = 2
        alo?

        i = 3
        alo?
        ......

        i = 7
         */
        for(int i=0; i<7; i++) {
            System.out.println("alo?");
        }

        int inicio = 0;
        int fin = 5;
        /*
        inicio = 0
        fin = 5
        ciao!

        inicio = 1
        fin = 3
        ciao!

        inicio = 2
        fin = 1
         */
        while(inicio < fin) {
            System.out.println("ciao!");
            inicio++;
            fin -= 2;
        }

        //Recorrido de arreglo
        // tamaño = 5. POiscion: 0, 1, 2, 3, 4
        /*
        posicion = 0
        miArreglo[0] -> 4

        posicion = 1
        miArreglo[1] -> 8

        posicion = 2
        miArreglo[2] -> 8

        posicion = 3
        miArreglo[3] -> 5

        posicion = 4
        miArreglo[4] ->9

        posicion = 5
         */
        for(int posicion=0; posicion<miArreglo.length; posicion++) {
            System.out.println(miArreglo[posicion]);
        }

        // int numerito = 9;
        // if(numerito % 3 == 0)

        HashMap<String, String> estudiante = new HashMap<String, String>();
        estudiante.put("nombre", "Elena");
        estudiante.put("apellido", "De Troya");
        estudiante.put("email", "elena@codingdojo.com");

        /*
        estudiante = {
            nombre: "Elena",
            apellido: "De Troya",
            email: "elena@codingdojo.com"
        }
         */

        System.out.println(estudiante.get("apellido"));
        
        Set<String> claves = estudiante.keySet();
        for(String clave:claves) {
            System.out.println(clave+":"+estudiante.get(clave));
        }


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