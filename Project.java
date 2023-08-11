public class Project {

    private String nombre;
    private String descripcion;

    public String elevatorPitch() {
        return this.nombre+":"+this.descripcion;
    }

    //Constructor vacío
    public Project() { }

    /*
    nombre = "Administrador de Tareas"
    proyecto2.nombre = "Administrador de Tareas"
     */
    public Project(String nombre) { 
        this.nombre = nombre;
    }
    /*
    nombre= "Cumpleaños Cynthia"
    descripcion = "¡Fiesta de Programación!"
    proyecto3.nombre = "Cumpleaños Cynthia"
    proyecto3.descripcion = "¡Fiesta de Programación!"
     */
    public Project(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    

}