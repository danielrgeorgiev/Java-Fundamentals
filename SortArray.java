import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = {3,5,6,7,85,3,3};

        int indexPosition = 2;
        int nextValue = 4;
        System.out.println(Arrays.toString(array));

        for (int i = array.length -1; i > indexPosition; i--) {
            array[i] = array[i - 1];
        }
        array[indexPosition] = nextValue;
        System.out.println(Arrays.toString(array));
    }
}
