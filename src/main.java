import java.util.Arrays;

public class main {
    public static void main(String [] args) {
        int [] array = {1, 5, 3, 7, 11,9, 15};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array))
    }
    private static void reverse (int [] array) {
        int maxIndex = array.length - 1;
        int i;
        for (i = 0; i < array.length / 2; i++)
            array[i] = array[maxIndex - i];
        int temp = array[i];
        array[maxIndex - i] = temp;

    }
}
