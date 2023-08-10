import java.util.ArrayList;
import java.util.Arrays;
public class BasicJavaTest {

    public static void main(String[] args) {
        //Pruebas

        BasicJava basic = new BasicJava ();

        int[] array = {1,5,10,-2};

        //Variables objetos en java TIENEN toString
        ArrayList<Object> mmp = basic.minMaxProm(array);

        System.out.println(mmp);

        int[] array2 = {1,5,10,7,-2};
        basic.cambiando(array2);
        System.out.println(Arrays.toString(array2));
    } 

}