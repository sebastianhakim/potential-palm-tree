import java.util.Arrays;
import java.util.Random;



public class Recursion {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        }



    public static void bubbleSort(int[] array) {
        for (int j = array.length - 1; j >= 1; j --) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }

            }
        }   

}

public static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i+1])
                return false;
    }
    return true;
    }


 
public static void main(String[] args) throws Exception {
    Random random = new Random();
    int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
    a[i] = random.nextInt(100);

    }
System.out.println(Arrays.toString(a));
System.out.println(isSorted(a));
bubbleSort(a);
System.out.println("After Bubble Sort: \n");
System.out.println(Arrays.toString(a));
System.out.println(isSorted(a));

}
}