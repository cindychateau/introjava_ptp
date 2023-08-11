/* Ejecutamos el que tenga el main
Mi TEST tiene el main */
class VehiculoTest {

    //Método main es el único que se ejecuta
    public static void main(String[] args) {

        Vehiculo auto1 = new Vehiculo();
        //auto1.anio = 2001;
        auto1.setAnio(2001);
        // auto1.marca = "Honda";
        auto1.setMarca("Honda");
        // auto1.modelo = "Civic";
        auto1.setModelo("Civic");
        // auto1.color = "blanco";
        auto1.setColor("blanco");
        // auto1.ruedas = 4;
        auto1.setRuedas(4);

        Vehiculo bici = new Vehiculo("rojo");

        System.out.println("Anio auto1:"+auto1.getAnio());
        System.out.println("Color bici:"+bici.getColor());

        Vehiculo bici2 = new Vehiculo("azul", 2);
        System.out.println("Bici2:"+bici2.getColor()+" "+bici2.getRuedas());

        Vehiculo auto2 = new Vehiculo(2018, "Mazda", "CX-3", "plata", 4);

        Vehiculo barco = new Vehiculo(1990, "Barcos y Botes", "Abc", "blanco", 0);

        System.out.println(barco.toString());
        System.out.println(barco);

        Vehiculo.queHace();

        barco.queHace();

    }

}