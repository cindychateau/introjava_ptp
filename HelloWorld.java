public class HelloWorld {

     //Permisos -> public, private, protected
     // static (es de clase)  
     //Tipo de valor de retorno -> String, int, double, void
     //Nombre de función
     //(Parámetros a recibir)
     // public static String nombreFuncion(param1, param2)
    public static String hola() {
        return "Hola mundo";
    } 

    //Sobrecarga
    public static String hola(String nombre) { 
        //nombre = "Elena"
        return "Hola "+nombre;
    }  

    public static String hola(String nombre, String apellido) {
        //nombre = "Elena"
        //apellido = "De Troya"
        return "Hola "+nombre+" ".concat(apellido);
    }  

    public static void hola(int num) {
        System.out.println("Hola "+num);
    }

}