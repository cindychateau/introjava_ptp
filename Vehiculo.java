/*Nombre de clase - PascalCase NombreDeClase */
class Vehiculo {

    /* Variables miembro - Características o atributos de mi objeto */
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas; //Integer -> funciones extra

    /* Constructor - Inicializa nuestro objeto */
    public Vehiculo() {}

    /* Sobrecarga - Al recibir distintos datos vamos a poder inicializar nuestro objeto de manera distinta 
    color = "rojo"
    bici.color = "rojo"
    */
    public Vehiculo(String color){
        //this representa el objeto que se está inicializando
        this.color = color;
    }

    /* Sobrecarga
    color = "azul" ruedas = 2
    bici2.color = "azul"
    bici2.ruedas = 2
     */
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public Vehiculo(int anio, String marca, String modelo, String color, int ruedas) {
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
    }

    public String toString() {
        return this.anio+" "+this.marca+" "+this.modelo+" "+this.color+" "+this.ruedas;
    }
    /*Métodos- camelCase nombreDeMetodo */
    //Encargado de cambiar el valor
    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Encargado de regresar el valor.
    public int getAnio(){   
        return this.anio;
    }
    /*
    this = auto1
    marca = "Honda"
    auto1.marca = "Honda"
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

}