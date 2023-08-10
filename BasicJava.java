import java.util.ArrayList;
public class BasicJava {

    //Métodos
    //x = {1,5,10,-2}
    //min = 1
    //max = 1
    //prom = 0
    //total = 0
    //--
    //i = 0
    //total = 1
    //--
    //i = 1
    // 1 > 5 X
    // 1 < 5 SI
    //max = 5
    //total = 6
    //--
    //i = 2
    //1 > 10 X
    //5 < 10 SI
    //max = 10
    //total = 16
    //--
    //i = 3
    //1 > -2 SI
    //min = -2
    //10 < -2 X
    //total = 14
    public static ArrayList<Object> minMaxProm(int[] x) {
        int min = x[0]; //-2
        int max = x[0]; //-2
        double prom = 0;
        int total = 0;

        for(int i=0; i < x.length; i++) {
            if(min > x[i]) {
                min = x[i];
            }

            if(max < x[i]) {
                max = x[i];
            }
            
            total += x[i];

        }

        prom = total / x.length; //3.5

        //Acepta cualquier tipo de dato
        ArrayList<Object> mmp = new ArrayList<Object>();
        mmp.add(min);
        mmp.add(max);
        mmp.add(prom);

        return mmp;

    }
    //[1,5,10,7,-2] -> [5,10,7,-2,0].
    public static void cambiando(int[] x) {
        for(int i=1; i<x.length; i++) {
            x[i-1] = x[i];
        }

        x[x.length-1] = 0;

    }

}