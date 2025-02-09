
import java.util.Arrays;

public class arraydeclaration {
    public static void main(String[] args) {
        //Declaration
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        //Accessing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[4]);
        //Modification
        arr[0] = 25;
        arr[4] = 07;
        System.out.println(Arrays.toString(arr));
    }
}
