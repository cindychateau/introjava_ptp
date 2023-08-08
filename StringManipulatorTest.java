public class StringManipulatorTest {

    public static void main(String[] args) {

        //Pruebas
        // StringManipulator manipulator = new StringManipulator();
        // String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        // System.out.println(str); // HolaMundo 

        // StringManipulator manipulator = new StringManipulator();
        // char letter = 'n';
        // int a = manipulator.getIndexOrNull("Coding", letter);
        // int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        // int c = manipulator.getIndexOrNull("Saludar", letter);
        // System.out.println(a); // 4
        // System.out.println(b); // 7
        // System.out.println(c); // -1

        // StringManipulator manipulator = new StringManipulator();
        // String word = "Hola";
        // String subString = "la";
        // String notSubString = "mundo";
        // int a = manipulator.getIndexOrNull(word, subString); // a = 2
        // int b = manipulator.getIndexOrNull(word, notSubString); //b = -1
        // System.out.println(a); // 2
        // System.out.println(b); // -1

        StringManipulator manipulator = new StringManipulator();
        String word = manipulator.concatSubstring("Hola", 1, 3, "mundo"); //word = "olmundo"
        System.out.println(word); // olmundo




    }

}