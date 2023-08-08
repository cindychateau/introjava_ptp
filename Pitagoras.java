public class Pitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {
        //La hipotenusa es el lado opuesto del ángulo recto.
        //Calcular el valor de c dados los valores catetoA y catetoB
        //Raiz cuadrada de suma entre catetoA al cuadrado + catetoB al cuadrado

        int aAlCuadrado = catetoA*catetoA; //Math.pow(catetoA, 2);
        int bAlCuadrado = catetoB*catetoB;
        int sumatoria = aAlCuadrado + bAlCuadrado;
        double c = Math.sqrt(sumatoria); //Raíz cuadrada

        //int = número entero
        //double = número con puntos decimals

        return c;

    }
}

