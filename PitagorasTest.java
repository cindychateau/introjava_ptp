public class PitagorasTest {

    //método principal -> Lo que se ejecuta
    public static void main(String[] args) {

        //Inicializar el objeto Pitagorass
        Pitagoras pitag = new Pitagoras();

        double resultado = pitag.calcularHipotenusa(3, 4);

        System.out.println("La hipotenusa es:" + resultado);

    }

}