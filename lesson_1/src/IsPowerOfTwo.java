/**
 * Created by Liminiksik on 29.09.2016.
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(two(-2));

    }

    public static boolean two(int value) {
        /*if ((value == 1) || (value == -2))
            return true;
        else if (value % 2 == 0){
            boolean b = two(value / 2);
            if (b)
                return true;
            else
                return false;
        } else
            return false;
        //return ... // you implementation here*/

        while (value > 1) {
            if (value % 2 != 0)
                return false;
            value /= 2;
        }

        if ((value == 1) || (value == -2))
            return true;
        return false;
    }
}
