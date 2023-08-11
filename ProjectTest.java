class ProjectTest {
    public static void main(String[] args){
        //Proyecto vacío
        Project proyecto1 = new Project();
        proyecto1.setNombre("Planificador de Eventos");
        proyecto1.setDescripcion("Programa para planificar los eventos de un bootcamp.");

        //Proyecto con nombre
        Project proyecto2 = new Project("Administrador de Tareas");
        proyecto2.setDescripcion("Proyecto para administrar las tareas de los alumnos");

        //Proyecto con nombre y descripcion
        Project proyecto3 = new Project("Cumpleaños Cynthia", "¡Fiesta de Programación!");

        System.out.println(proyecto1.elevatorPitch());
        System.out.println(proyecto2.elevatorPitch());
        System.out.println(proyecto3.elevatorPitch());

        System.out.println(proyecto1.toString());

    }
}