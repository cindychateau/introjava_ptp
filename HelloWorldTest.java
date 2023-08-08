public class HelloWorldTest {

    //Método principal
    public static void main(String[] args) {

        //Inicializar la clase
        //NombreClase nombreVariable = new NombreClase();
        HelloWorld helloApp = new HelloWorld();

        String saludo = helloApp.hola();
        System.out.println(saludo);

        String saludo2 = helloApp.hola("Elena");
        System.out.println(saludo2);

        String saludo3 = helloApp.hola("Elena", "De Troya"); //saludo3 = Hola Elena de Troya

        String saludoCompleto = saludo3 + ", que tengas una excelente tarde";
        
        System.out.println(saludoCompleto);

        //helloApp.hola(1);
    }

}