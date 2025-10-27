import java.lang.reflect.Array;
import java.util.Arrays;

public class Temp{
    public static void main(String[] args){
        int[] arr=new int[5];
        System.out.println(arr.length);
        arr[0]=5;
        arr[1]=7;
        arr[2]=5;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}