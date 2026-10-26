import java.util.Arrays;

public class Main{
    public static void Main(String[] args){
        int[] array1 = {2,1,7,6,3};
        int[] array2 = {3,6,7,2,1};

        System.out.println("Array original: " + Arrays.toString(array1));

        insertionSort(array1);
        System.out.println("Insertion Sort: " + Arrays.toString(array1));

   }
}